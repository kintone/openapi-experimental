export type OpenAPiSpec = {
  paths: {
    [path in string]: {
      [method in string]: {
        tags?: string[];
        summary?: string;
        description?: string;
        operationId?: string;
        requestBody?: {
          description?: string;
          content?: {
            "application/json": {
              schema: Schema;
            };
          };
        };
        parameters?: Parameter[];
        responses?: {
          [code in string]: {
            description?: string;
            content?: {
              "application/json": {
                schema?: Schema;
              };
            };
          };
        };
      };
    };
  };
};

export type Parameter = {
  name: string;
  in: string;
  required?: boolean;
  description: string;
  schema: Schema;
};

export type Schema = {
  type: string;
  properties?: {
    [key in string]: Schema;
  };
  required?: string[];
  description?: string;
  enum?: string[];
  items?: Schema;
};
