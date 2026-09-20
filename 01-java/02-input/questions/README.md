# Module 02: Practice Questions & Problem Solutions

> Hands-on problem statements, sample inputs, formulas, and dry runs for Module 02 (User Input with Scanner).

---

## Question 1: Average of 3 Numbers

- **File**: [`q1_average.java`](./q1_average.java)
- **Concept**: User input with `Scanner.nextInt()`, arithmetic average computation.

### Problem Statement:
Take 3 integers `A`, `B`, and `C` as input from the console and output their average.

### Formula:
$$\text{Average} = \frac{A + B + C}{3}$$

---

## Question 2: Area of a Square

- **File**: [`q2_square_area.java`](./q2_square_area.java)
- **Concept**: User input with `Scanner.nextInt()`, geometric area calculation.

### Problem Statement:
Take the side length of a square as input and output the area of the square.

### Formula:
$$\text{Area} = \text{side} \times \text{side}$$

---

## Question 3: Item Bill with 18% GST

- **File**: [`q3_bill_gst.java`](./q3_bill_gst.java)
- **Concept**: Floating-point user input with `Scanner.nextFloat()`, tax percentage computation.

### Problem Statement:
Input the cost of 3 items (pencil, pen, eraser) as `float` values. Compute the total bill including an 18% GST addition.

### Calculation:
1. $\text{Total} = \text{pencil} + \text{pen} + \text{eraser}$
2. $\text{GST} = \text{Total} \times 0.18$
3. $\text{Final Bill} = \text{Total} + \text{GST}$

---

## Question 4: Robust Profile Form (Buffer Trap Fix)

- **File**: [`q4_profile_form.java`](./q4_profile_form.java)
- **Concept**: Mixed `Scanner` input types, resolving the dangling `\n` buffer trap before `nextLine()`.

### Problem Statement:
Sequentially input an integer User ID, a multi-word Full Name, a double Hourly Wage, and a multi-word Department Name without skipping fields.
