import { SmallPriceSpan } from "../text/SmallPriceSpan";
import { CartItemDetails } from "./CartItemDetails";
import {RemoveCartProductButton } from "../buttons/RemoveCartProductButton"
import "./CartItem.css"
import { FlexDummy } from "./FlexDummy";

/**
 * Component representing an item in the shopping cart.
 * 
 * @param {*} props the properties of the item
 * @returns {JSX.Element} a container with all its children
 */
export function CartItem(props) {
    return (
        <div className="cartItem">
            <CartItemDetails src={props.src} alt={props.alt} text={props.text} value={props.value} price={props.price}></CartItemDetails>
            <SmallPriceSpan text={props.price}></SmallPriceSpan>
            <RemoveCartProductButton></RemoveCartProductButton>
        </div>
    );
}