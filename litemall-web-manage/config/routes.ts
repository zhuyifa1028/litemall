export default [
  {
    path: '/user',
    layout: false,
    routes: [
      {name: '登录', path: '/user/login', component: './user/Login'},
      {component: './404'},
    ],
  },
  {path: '/welcome', name: '欢迎', icon: 'smile', component: './Welcome'},
  {
    path: '/admin',
    name: '管理页',
    icon: 'crown',
    access: 'canAdmin',
    routes: [
      {path: '/admin/sub-page', name: '二级管理页', icon: 'smile', component: './Welcome'},
      {component: './404'},
    ],
  },
  {name: '查询表格', icon: 'table', path: '/list', component: './TableList'},
  {
    path: '/system',
    name: '系统管理',
    icon: 'crown',
    access: 'canAdmin',
    routes: [
      {path: '/system/dept', name: '部门管理', icon: 'smile', component: './system/dept'},
      {component: './404'},
    ],
  },
  {path: '/', redirect: '/welcome'},
  {component: './404'},
];
