WE Can Code IT
ATM Bridge Project
5/18/2018 Anthony J. DeMeglio

<h1 id="atm">ATM</h1>

<h2 id="objective">Objective</h2>

<p>Using TDD, design an <code class="highlighter-rouge">Atm</code> class and an <code class="highlighter-rouge">AtmClientApp</code> (with a <code class="highlighter-rouge">main</code> method) to simulate access and transactions that occur with an ATM (<strong>A</strong>utomatic <strong>T</strong>eller <strong>Machine</strong>).  The ATM should require the user to enter a 4 digit PIN (<strong>P</strong>ersonal <strong>I</strong>dentification <strong>N</strong>umber) to gain access.</p>

<h3 id="tasks">Tasks</h3>

<p>Complete the following tasks.</p>

<p>Where these instructions mention prompting the user or displaying information, this should be done via console. Also, all of the console input/output should be done from the <code class="highlighter-rouge">AtmClientApp</code> class.</p>

<h4 id="require-a-pin-for-access">Require a PIN for access</h4>

<p>Your <code class="highlighter-rouge">Atm</code> class should have:</p>

<ul>
  <li>an <em>instance variable</em> of type <code class="highlighter-rouge">String</code> called <code class="highlighter-rouge">requiredPin</code> that holds the PIN required to gain access.</li>
  <li>a <em>method</em> with the signature <code class="highlighter-rouge">boolean allowAccess(String enteredPin)</code> that checks to see whether a PIN the user entered is valid.</li>
</ul>

<p>Your <code class="highlighter-rouge">AtmClientApp</code> class should:</p>

<ul>
  <li>create an instance of <code class="highlighter-rouge">Atm</code>.</li>
  <li>prompt the user for a PIN number via the console.</li>
  <li>display either a success or failure message based on the PIN the user entered.</li>
</ul>

<h5 id="stretch-task">Stretch Task</h5>

<ul>
  <li>Create a <em>constructor</em> that allows the required PIN to be specified during object construction.</li>
</ul>

<h4 id="allow-deposits">Allow deposits</h4>

<p>Add the following to your <code class="highlighter-rouge">Atm</code> class:</p>

<ul>
  <li>an <em>instance variable</em> of type <code class="highlighter-rouge">double</code> called <code class="highlighter-rouge">balance</code> that stores the user’s account balance. Feel free to initialize this with an arbitrary beginning balance.</li>
  <li>a <em>method</em> with the signature <code class="highlighter-rouge">void deposit(double amount)</code> that increases the value of <code class="highlighter-rouge">balance</code> by <code class="highlighter-rouge">amount</code>.</li>
</ul>

<p>Add the following to your <code class="highlighter-rouge">AtmClientApp</code> class (these are all predicated on the user having entered the correct PIN):</p>

<ul>
  <li>display a menu, with only one option for now: <code class="highlighter-rouge">Press 1 to deposit funds</code>.</li>
  <li>prompt the user to select an option. So long as she selects anything other than <code class="highlighter-rouge">1</code>, redisplay the menu.</li>
  <li>prompt the user for a deposit amount.</li>
  <li>call the <code class="highlighter-rouge">deposit</code> method on <code class="highlighter-rouge">Atm</code> to deposit the amount specified.</li>
  <li>display the current account balance.</li>
</ul>

<h5 id="stretch-task-1">Stretch Task.</h5>

<ul>
  <li>add the beginning balance to the <code class="highlighter-rouge">Atm</code> <em>constructor</em>.</li>
  <li>use <code class="highlighter-rouge">java.math.BigDecimal</code> to store balance instead of <code class="highlighter-rouge">double</code>.</li>
</ul>

<h4 id="allow-withdrawals">Allow withdrawals</h4>

<p>Add the following to your <code class="highlighter-rouge">Atm</code> class:</p>

<ul>
  <li>a <em>method</em> with the signature <code class="highlighter-rouge">void withdraw(double amount)</code> that decreases the value of <code class="highlighter-rouge">balance</code> by <code class="highlighter-rouge">amount</code>.</li>
</ul>

<p>Update your <code class="highlighter-rouge">AtmClientApp</code> to:</p>
<ul>
  <li>offer a <code class="highlighter-rouge">Press 2 to withdraw funds</code> option.</li>
  <li>prompt the user for a withdrawal amount.</li>
  <li>call the <code class="highlighter-rouge">withdraw</code> method with the specified amount.</li>
</ul>

<h4 id="allow-balance-inquiries">Allow balance inquiries.</h4>

<p>Update your <code class="highlighter-rouge">AtmClientApp</code> to:</p>
<ul>
  <li>offer a <code class="highlighter-rouge">Press 3 to check balance</code> option.</li>
  <li>display the current balance when this option is chosen.</li>
</ul>

<h4 id="input-loop">Input loop</h4>

<p>Update your <code class="highlighter-rouge">AtmClientApp</code>, adding a <code class="highlighter-rouge">Press 4 to exit</code> option. Keep prompting the user to select an option until they enter <code class="highlighter-rouge">4</code> to exit, then print a goodbye message.</p>
<h2 id="examples">Examples</h2>

<div class="language-bash highlighter-rouge"><div class="highlight"><pre class="highlight"><code>Enter your PIN: 
1234
Welcome to Bank of We Can Code IT!
Choose an option.
Press 1 to deposit funds.
Press 2 to withdrawal funds.
Press 3 to check balance.
Press 4 to exit.
1
Enter a deposit amount
50
Updated bal is: 150.0
</code></pre></div></div>
<h3 id="using-tdd-to-build-out-this-project">Using TDD to build out this project</h3>

<p>Here are the following asserts that will allow us to build out all of the requirements above through the process of TDD.</p>
<ul>
  <li>a test for a default balance</li>
  <li>an ability to withdraw from that default balance</li>
  <li>a limit on withdraw based on available balance</li>
  <li>an ability to make an accurate deposit</li>
  <li>an ability to allow access by PIN</li>
  <li>an ability to deny access by PIN</li>
</ul>