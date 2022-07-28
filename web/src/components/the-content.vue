<template>
    <a-layout-header style="background: #fff; padding: 0">
    </a-layout-header>
    <a-layout-content
        :style="{ margin: '24px 16px', padding: '24px', background: '#fff', minHeight: '280px' }"
    >
      Content
    </a-layout-content>

  <a-layout-footer style="text-align: center">
    Mixiao-mssm @2022-7-28
  </a-layout-footer>
</template>

<script lang="ts">
import {defineComponent} from "vue";
export default defineComponent({
  name:'the-content',
  components: {

  },
});

</script>

