<template>
  <v-menu offset-y left transition="slide-y-transition">
    <template v-slot:activator="{ props }">
      <v-btn icon size="small" class="elevation-2" v-bind="props">

        <v-badge color="success" dot bordered>
          <v-avatar size="40" :class="{ 'bg-grey': !userInfo.userAvatarUrl }">
            <v-img v-if="!!userInfo.userAvatarUrl" :src="userInfo.userAvatarUrl"></v-img>
          </v-avatar>
        </v-badge>
      </v-btn>
    </template>

    <!-- user menu list -->
    <v-list dense nav>
      <v-list-item v-if="!isLogin">
        <v-list-item-title>{{ $t('usermenu.notSignin') }}</v-list-item-title>
      </v-list-item>
      <v-list-item v-else v-for="(item, index) in menu" :key="index" :to="item.link" link replace>
        <template v-slot:prepend>
          <v-icon size="small" :icon="item.icon"></v-icon>
        </template>
        <v-list-item-title>{{ $t(item.key) }}</v-list-item-title>
      </v-list-item>
      <v-list-item key="setting" @click="openSetting">
        <template v-slot:prepend>
          <v-icon size="small" icon="mdi-cog"></v-icon>
        </template>
        <v-list-item-title>设置</v-list-item-title>
      </v-list-item>

      <v-divider class="my-1"></v-divider>

      <v-list-item @click="logout" prepend-icon="mdi-logout-variant" :title="$t('menu.logout')">
      </v-list-item>
    </v-list>


  </v-menu>
</template>

<script setup lang="ts">
import { reactive } from "vue";
import Bus from "@/utils/common/Bus";
const auth = useAuthStore();
const { userInfo } = useAuthStore();
const { isLogin } = storeToRefs(auth)

const openSetting = () => {
  Bus.emit('openSetting', true)
}


const menu = reactive(
  [
    { icon: 'mdi-account-box-outline', key: 'menu.profile', name: 'apps_manager-user_edit', link: `/apps/manager-user/edit/${userInfo.userName}` },
    // {icon: 'mdi-format-list-checkbox', key: 'menu.todo', link: '/apps/todo'},
    // {icon: 'mdi-email-outline', key: 'menu.board', link: '/apps/board'},
    { icon: 'mdi-music', key: 'menu.chat', name: 'apps_chat-channel', link: '/apps/chat-channel/:id' }
  ]
)




const logout = () => {
  window.$dialog?.show({
    title: '登出',
    main: '确定要登出吗?',
    confirm: () => {
      window.$loadingOverly?.show()
      setTimeout(() => {
        auth.resetAuthStore()
        Bus.emit('rightCircleBtnShow', false)
      }, 1000)
    }

  })
}
</script>
