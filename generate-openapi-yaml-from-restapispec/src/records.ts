export type Record = {
  レコード番号: {
    value: string;
  };
  レスポンスパラメータ: {
    value: ResponseParam[];
  };
  リクエストサンプル: { value: string };
  パス: { value: string };
  レスポンスサンプル: { value: string };
  リクエストパラメータ: {
    value: RequestParam[];
  };
  エラー: {
    value: {
      value: {
        ステータスコード: {
          value: string;
        };
        エラー原因: {
          value: string;
        };
        エラー文言: {
          value: string;
        };
        エラーコード: {
          value: string;
        };
      };
    }[];
  };
  HTTPメソッド: {
    value: "GET" | "POST" | "PUT" | "DELETE" | "HEAD" | "PATCH";
  };
  概要: {
    value: string;
  };
};

export type RequestParam = {
  value: {
    リクエストパラメータ説明: {
      value: string;
    };
    リクエストパラメータ型: {
      value:
        | "Array"
        | "数値（文字列型でも指定可）"
        | "整数（文字列型でも指定可）"
        | "Object"
        | "文字列"
        | "真偽値（文字列型でも指定可）"
        | "*";
    };
    リクエストパラメータ名: {
      value: string;
    };
    リクエストパラメータ必須: {
      value: string[] | ["必須"];
    };
    ドロップダウン: {
      // 空のArray
      value: null | "許容しない" | "許容する";
    };
    リクエストArrayの要素の型: {
      value:
        | null
        | "Array"
        | "整数（文字列型でも指定可）"
        | "Object"
        | "文字列"
        | "*";
    };
  };
};

export type ResponseParam = {
  value: {
    レスポンスArrayの要素の型: {
      value: null | "Array" | "数値" | "Object" | "文字列" | "*";
    };
    レスポンスパラメータ名: {
      value: string;
    };
    レスポンスパラメータ型: {
      value:
        | "Array"
        | "数値（文字列型）"
        | "整数（文字列型）"
        | "Object"
        | "文字列"
        | "真偽値"
        | "*";
    };
    レスポンスパラメータ説明: {
      value: string;
    };
  };
};

export type Records = {
  records: Record[];
};

export const formatType = (
  value:
    | "Array"
    | "数値（文字列型）"
    | "整数（文字列型）"
    | "Object"
    | "文字列"
    | "真偽値"
    | "*"
    | "数値"
    | "数値（文字列型でも指定可）"
    | "整数（文字列型でも指定可）"
    | "真偽値（文字列型でも指定可）"
) => {
  switch (value) {
    case "Array":
      return "array";
    case "*":
    case "Object":
      return "object";
    case "文字列":
      return "string";
    case "真偽値":
    case "真偽値（文字列型でも指定可）":
      return "boolean";
    case "数値":
    case "数値（文字列型）":
    case "数値（文字列型でも指定可）":
      return "number";
    case "整数（文字列型）":
    case "整数（文字列型でも指定可）":
      return "integer";
    default:
      return "object";
  }
};
