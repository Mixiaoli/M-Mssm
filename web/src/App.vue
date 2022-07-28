<template>
  <a-layout>
    <the-sider></the-sider>
      <a-layout>
      <the-content></the-content>
      </a-layout>
  </a-layout>
</template>
<script lang="ts">

import { defineComponent, ref } from 'vue';
import TheContent from '@/components/the-content.vue';
import TheSider from "@/components/the-sider.vue";
export default defineComponent({
  components: {
    TheContent,
    TheSider,
  },
});
</script>
<style>
#components-layout-demo-custom-trigger .trigger {
  font-size: 18px;
  line-height: 64px;
  padding: 0 24px;
  cursor: pointer;
  transition: color 0.3s;
}

#components-layout-demo-custom-trigger .trigger:hover {
  color: #1890ff;
}

#components-layout-demo-custom-trigger .logo {
  height: 32px;
  background: rgba(255, 255, 255, 0.3);
  margin: 16px;
}

.site-layout .site-layout-background {
  background: #fff;
}
</style>
