/*
 * Product Catalog API
 * The Product Catalog API enables customers browse Acme Pet Supplies great range of pet products and their product reviews.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: john.smith@acme-pet-supplies.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * An item in Acme&#39;s pet supplies catalog.
 */
@ApiModel(description = "An item in Acme's pet supplies catalog.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T21:49:13.443346Z[Europe/London]")
public class Product {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private Set<String> keywords = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_REVIEW_RATING = "reviewRating";
  @SerializedName(SERIALIZED_NAME_REVIEW_RATING)
  private Integer reviewRating;

  public static final String SERIALIZED_NAME_NUMBER_OF_REVIEWS = "numberOfReviews";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REVIEWS)
  private Integer numberOfReviews;

  public Product() {
  }

  public Product id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier for the product.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "dcd53ddb-8104-4e48-8cc0-5df1088c6113", required = true, value = "Identifier for the product.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Product name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the product.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Acme Uber Dog Rope Toy", required = true, value = "Name of the product.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Product description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the product.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Acme Uber Dog Rope Toy provides hours of fun for your dog. Great for bouncing, throwing and catching.", required = true, value = "A description of the product.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Product price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price of the product.
   * minimum: 0
   * maximum: 1000000
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "Price of the product.")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public Product keywords(Set<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public Product addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * A colleciton of words that describe the product, used for searching for it.
   * @return keywords
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A colleciton of words that describe the product, used for searching for it.")

  public Set<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(Set<String> keywords) {
    this.keywords = keywords;
  }


  public Product reviewRating(Integer reviewRating) {
    
    this.reviewRating = reviewRating;
    return this;
  }

   /**
   * Average product review rating.
   * minimum: 1
   * maximum: 5
   * @return reviewRating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Average product review rating.")

  public Integer getReviewRating() {
    return reviewRating;
  }


  public void setReviewRating(Integer reviewRating) {
    this.reviewRating = reviewRating;
  }


  public Product numberOfReviews(Integer numberOfReviews) {
    
    this.numberOfReviews = numberOfReviews;
    return this;
  }

   /**
   * Number of product reviews.
   * @return numberOfReviews
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "Number of product reviews.")

  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }


  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.keywords, product.keywords) &&
        Objects.equals(this.reviewRating, product.reviewRating) &&
        Objects.equals(this.numberOfReviews, product.numberOfReviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, price, keywords, reviewRating, numberOfReviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    reviewRating: ").append(toIndentedString(reviewRating)).append("\n");
    sb.append("    numberOfReviews: ").append(toIndentedString(numberOfReviews)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("price");
    openapiFields.add("keywords");
    openapiFields.add("reviewRating");
    openapiFields.add("numberOfReviews");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("keywords");
    openapiRequiredFields.add("reviewRating");
    openapiRequiredFields.add("numberOfReviews");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Product
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Product.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Product is not found in the empty JSON string", Product.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Product.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Product` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Product.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("keywords") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Product.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Product' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Product> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Product.class));

       return (TypeAdapter<T>) new TypeAdapter<Product>() {
           @Override
           public void write(JsonWriter out, Product value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Product read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Product given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Product
  * @throws IOException if the JSON string is invalid with respect to Product
  */
  public static Product fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Product.class);
  }

 /**
  * Convert an instance of Product to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

