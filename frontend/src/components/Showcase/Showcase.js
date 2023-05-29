import "./Showcase.css";
import { ShowcaseCard } from "./ShowcaseCard";

const jsonTestData = {
  id: "2",
  name: "Black Coffe",
  price: "122",
  description: "Brazilian coffee is sealed for freshness...",
};

/**
 * A section of showcased products
 *
 * @return {JSX.Element}
 * @constructor
 */
export function Showcase() {
  return (
    <container className="product-section">
      <h2>New Releases</h2>
      <container className="product-container">
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
      </container>
    </container>
  );
}