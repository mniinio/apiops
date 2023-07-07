package com.acmepetsupplies.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An item in Acme&#39;s pet supplies catalog.
 */

@Schema(name = "Product", description = "An item in Acme's pet supplies catalog.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-31T13:20:55.039973Z[Europe/London]")
public class Product {

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("keywords")
  @Valid
  private Set<String> keywords = new LinkedHashSet<>();

  public Product id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier for the product.
   * @return id
  */
  @NotNull @Valid 
  @Schema(name = "id", example = "dcd53ddb-8104-4e48-8cc0-5df1088c6113", description = "Identifier for the product.", required = true)
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
  */
  @NotNull @Size(min = 1, max = 50) 
  @Schema(name = "name", example = "Acme Uber Dog Rope Toy", description = "Name of the product.", required = true)
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
  */
  @NotNull @Size(min = 0, max = 300) 
  @Schema(name = "description", example = "Acme Uber Dog Rope Toy provides hours of fun for your dog. Great for bouncing, throwing and catching.", description = "A description of the product.", required = true)
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
  */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("1000000") 
  @Schema(name = "price", example = "100", description = "Price of the product.", required = true)
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
  */
  @NotNull @Size(min = 0, max = 20) 
  @Schema(name = "keywords", description = "A colleciton of words that describe the product, used for searching for it.", required = true)
  public Set<String> getKeywords() {
    return keywords;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setKeywords(Set<String> keywords) {
    this.keywords = keywords;
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
        Objects.equals(this.keywords, product.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, price, keywords);
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
}

