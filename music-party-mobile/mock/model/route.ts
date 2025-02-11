export const routeModel: Record<Auth.RoleType, AuthRoute.Route[]> = {
  admin: [
    {
      name: 'apps',
      path: '/apps',
      component: 'basic',
      children: [
        {
          name: 'apps_manager-user',
          path: '/apps/manager-user',
          component: 'blank',
          children: [
            {
              name: 'apps_manager-user_edit',
              path: '/apps/manager-user/edit',
              component: 'self',
              meta: {
                title: 'menu.usersEdit',
                dynamicPath: '/apps/manager-user/edit/:id?',
                requiresAuth: true,
                keepAlive: false
              }
            }
          ],
          meta: {
            title: 'menu.users',
            icon: 'mdi-account-multiple-outline',
            requiresAuth: true,
            order: 2,
          }
        },
        {
          name: 'apps_board',
          path: '/apps/board',
          component: 'self',
          meta: {
            title: 'menu.board',
            icon: 'mdi-view-column-outline',
            order: 1,
            requiresAuth: true,
          }
        },
        {
          name: 'apps_todo',
          path: '/apps/todo',
          component: 'todo',
          children: [
            {
              name: 'apps_todo_tasks',
              path: '/apps/todo/tasks',
              component: 'self',
              meta: {
                title: 'todo.tasks',
                requiresAuth: true,
                hide: true,
              }

            },
            {
              name: 'apps_todo_completed',
              path: '/apps/todo/completed',
              component: 'self',
              meta: {
                title: 'todo.completed',
                requiresAuth: true,
                hide: true,
              }
            },
            {
              name: 'apps_todo_label',
              path: '/apps/todo/label',
              component: 'self',
              meta: {
                title: 'todo.labels',
                hide: true,
                requiresAuth: true,
                dynamicPath: '/apps/todo/label/:id'
              }

            }
          ],
          meta: {
            title: 'menu.todo',
            icon: 'mdi-format-list-checkbox',
            requiresAuth: true,
            order: 1
          }
        },
        {
          name: "apps_chat",
          path: "/apps/chat",
          component: "chat",
          children: [
            {
              name: 'apps_chat-channel',
              path: '/apps/chat-channel',
              component: 'self',
              meta: {
                title: 'menu.chat-channel',
                dynamicPath: '/apps/chat-channel/:id?',
                // hide: true,
                keepAlive: false
              }
            }
          ],
          meta: {
            title: "menu.chat",
            order: 1,
            icon: "mdi-music"
          }
        }
      ],
      meta: {
        title: 'menu.apps',
        requiresAuth: true,
      }
    },
    {
      name: 'other',
      path: '/other',
      component: 'basic',
      meta: {
        title: 'menu.others'
      },
      children: [
        {
          name: 'blank-page',
          path: '/blank-page',
          component: 'blank',
          meta: {
            title: 'menu.blank',
            icon: 'mdi-file-outline',
          }
        },
        {
          name: 'other_menu-levels',
          component: 'blank',
          path: '/other/menu-levels',
          meta: {
            title: 'menu.levels'
          },
          children: [
            {
              name: 'other_menu-levels-2-1',
              path: '/other/menu-levels-2-1',
              component: 'self',
              meta: {
                title: 'menu.levels2-1'
              }
            },
            {
              name: 'other_menu-levels-2-2',
              path: '/other/menu-levels-2-2',
              component: 'blank',
              meta: {
                title: 'menu.levels2-2',
              },
              children: [
                {
                  name: 'other_menu-levels-3-1',
                  path: '/other/menu-levels-3-1',
                  component: 'self',
                  meta: {
                    title: 'menu.levels3-1'
                  }
                },
                {
                  name: 'other_menu-levels-3-2',
                  path: '/other/menu-levels-3-2',
                  component: 'self',
                  meta: {
                    title: 'menu.levels3-2'
                  }
                }
              ]
            }
          ]
        },

      ]
    },
  ],
  user: [
    {
      name: 'apps',
      path: '/apps',
      component: 'basic',
      children: [
        {
          name: "apps_chat",
          path: "/apps/chat",
          component: "chat",
          children: [
            {
              name: 'apps_chat-channel',
              path: '/apps/chat-channel',
              component: 'self',
              meta: {
                title: 'menu.chat-channel',
                dynamicPath: '/apps/chat-channel/:id?',
                // hide: true,
                keepAlive: false
              }
            }
          ],
          meta: {
            title: "menu.chat",
            order: 1,
            icon: "mdi-music"
          }
        },

        {
          name: 'apps_manager-user',
          path: '/apps/manager-user',
          component: 'blank',
          children: [
            {
              name: 'apps_manager-user_edit',
              path: '/apps/manager-user/edit',
              component: 'self',
              meta: {
                title: 'menu.usersEdit',
                dynamicPath: '/apps/manager-user/edit/:id?',
                requiresAuth: true,
                keepAlive: false
              }
            }
          ],
          meta: {
            title: 'menu.users',
            icon: 'mdi-account-multiple-outline',
            requiresAuth: true,
            order: 2,
          }
        },
      ],
      meta: {
        title: 'menu.apps',
        requiresAuth: true,
      }
    },
    {
      name: 'special',
      path: '/special',
      component: 'blank',
      children: [
        {
          name: "special_music",
          path: "/special/music",
          component: "music",
          meta: {
            title: "menu.chat",
            hide: true,
            transition: 'animate__slideInLeft'
          }
        },
      ],
      meta: {
        title: 'menu.apps',
        requiresAuth: true,
      }
    }
  ]
};
