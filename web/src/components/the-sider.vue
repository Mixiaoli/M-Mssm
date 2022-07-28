<template>
    <a-layout-sider v-model:collapsed="collapsed" :trigger="null" collapsible>
      <div class="logo">Mixiaoli</div>
      <a-menu theme="dark" mode="inline" v-model:selectedKeys="selectedKeys">
        <a-menu-item key="1">
          <user-outlined />
          <span>nav 1</span>
        </a-menu-item>
        <a-menu-item key="2">
          <video-camera-outlined />
          <span>nav 2</span>
        </a-menu-item>
        <a-menu-item key="3">
          <upload-outlined />
          <span>nav 3</span>
        </a-menu-item>
      </a-menu>
    </a-layout-sider>
</template>

<script lang="ts">
import {
  UserOutlined,
  VideoCameraOutlined,
  UploadOutlined,
} from '@ant-design/icons-vue';
import {defineComponent,ref} from "vue";
export default defineComponent({
  name:'the-sider',
  components: {
    UserOutlined,
    VideoCameraOutlined,
    UploadOutlined,
  },
  setup() {
    return {
      selectedKeys: ref<string[]>(['1']),
      collapsed: ref<boolean>(false),
    };
  },
});

</script>

<style>
.logo {
  width: 160px;
  height: 41px;
  background: rgba(255, 255, 255, 0.2);
  margin: 16px 28px 16px 3px;
  float: left;
  color: white;
  font-size: 15px;
}

.login-menu {
  float: right;
  color: white;
  padding-left: 10px;
}
</style>