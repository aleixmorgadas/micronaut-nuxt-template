<template>
  <div class="relative flex items-top justify-center min-h-screen bg-gray-100 sm:items-center sm:pt-0">
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.1.2/dist/tailwind.min.css" rel="stylesheet">
    <div>
      <p>Name {{ sampleData.name }}</p>
      <p>Value {{ sampleData.value }}/10</p>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue'

export default Vue.extend({
  data () {
    return {
      sampleData: {}
    }
  },
  async mounted () {
    const response = await fetch('http://localhost:8080/sample/data')
    this.sampleData = await response.json()
  }
})
</script>
