import { defineConfig } from "@hey-api/openapi-ts";

export default defineConfig({
  client: "@hey-api/client-fetch",
  // client: '@hey-api/client-axios',
  input: "../openapi.yaml",
  output: "src/generated",
  plugins: [
    {
      asClass: true,
      name: '@hey-api/services',
    },
  ],
});
