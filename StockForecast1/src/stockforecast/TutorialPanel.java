/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockforecast;

import java.awt.*;
import javax.swing.*;
import java.io.*;

class TutorialPanel extends JPanel {
    
    JLabel label1;
    JTextArea jtaTut;
    JScrollPane jspArea;
    
    public TutorialPanel() throws Exception
    {
        
        Color c = new Color(165,214,223);
        setBackground(Color.white);
        //ImageIcon img = new ImageIcon("perceptron.jpg");
        
        label1 = new JLabel();
        String s;
        String s1 = "perceptron.jpg";
        
        s = "<html><body> <h1> Basic Neural Network Tutorial – Theory<hr></h1> "
                + "<p> Well this tutorial has been a long time coming. Neural Networks (NNs) are something that i’m " 
                + "interested in and also a technique that gets mentioned a lot in movies and by pseudo-geeks when</p>"
                + "<p>referring to AI in general. They are made out to be these really intense and complicated systems"
                + "when in fact they are nothing more than a simple input output machine (well at least for the standard</p>"
                + "<p>Feed Forward Neural Networks (FFNN) ).  As with any field the more you delve into it the more"
                + "technical it gets and NNs are the same, the more research you do into them the more complicated</p>"
                + "<p>architectures, training techniques, activation functions become. For now this is just a simple primer"
                + "into NNs. </p> "
                
                + "<h2> Introduction to Neural Networks </h2>"
                + "<p>There are many different types of neural networks and techniques for training them but I’m just"
                + "going to focus on the most basic one of them all – the classic back propagation neural network (BPN).</p>"
                + "<p>The back propagation refers to the fact that any mistakes made by the network during training get"
                + "sent backwards through it in an attempt to correct it and so teach the network whats right and wrong.</p>"
                + "<p> </p>"
                + "<p>This BPN uses the gradient descent learning method. Trying to describe this simply at this point is "
                + "going to be difficult so I’ll leave it for a bit later, all you need to know is that it’s so called because it</p>"
                + "<p>follows the steepest gradient down a surface which represents the error function as it tries to find the"
                + "minimum of the error function and by doing so decrease the error.</p>"
                + "<p> </p>"
                + "<p>I wanted to skip over the basics of neural networks, and all that this is your brain and this is a"
                + "neuron but I guess it’s unavoidable. I’m not going to go into great detail as there is plenty of</p>"
                + "<p>information already available online. Here are the wiki entries on FFNNs and back propagation:</p>"
                + "<p></p>"
                + "<a href = " + "http://en.wikipedia.org/wiki/Back-propagation" + ">" + "http://en.wikipedia.org/wiki/Back-propagation</a>"
                + "<p> </p>"
                
                + "<h2> The Neuron </h2>"
                + "<p>Okay enough blabbering from me; let’s get into the thick of it. The basic building block of a NN is the"
                + "neuron. The basic neuron is consists of a black box with weighted inputs and an output.</p>"
                
                + "<img src = \"file:perceptron.jpg\" alt = Perceptron />"
                
                + "<p> </p>"
                + "<p>The black box section of the neuron consists of an activation function F(X), in our case its F(wSum – T) "
                + "where wSum is the weighted sum of the inputs and T is a threshold or bias value. We’ll come back to </p>"
                + "<p>the threshold value just now. The weights are initialized to some small random values and during "
                + "training get updated. The weighted sum (wSum) is given below.</p>"
                
                + "<img src = \"file:wsum.jpg\" alt = Perceptron />"
                
                + "<p> </p>"
                + "<p>Now for the function F, there are various functions that can be used for F; the most common ones"
                + "include the step function and the sigmoid function. We will be using the sigmoid function in our BPN as</p>"
                + "<p>its again the classical activation function. The sigmoid function and its derivative are defined as:</p>"
                
                + "<img src = \"file:sigmoid.jpg\" alt = Perceptron />"
                
                + "<p>The sigmoid function has the following graph :</p>"
                
                + "<img src = \"file:sigmoidfunction.jpg\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<p>Note: Now its very important to realize that the sigmoid function can never return a 0 or a 1 due to its"
                + "asymptopic nature. So often its a good idea to treat values over 0.9 as 1 and under 0.1 as 0.</p>"
                + "<p> </p>"
                + "<p>Now we need to cover an important point regarding the input data and the desired output. Lets use"
                + "the binary OR operator as an example to explain the function of the weights and threshold. With OR </p>"
                + "<p>we want a binary output telling us whether its true or not, so a single perceptron with two inputs is "
                + "created. Now the search space for the neural network can be drawn as follows:</p>"
                
                + "<img src = \"file:lsds.jpg\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<p>The dark blue dots represents values of true and the light blue dot represents a value of false, you can"
                + "clearly see how the two classes are seperable. We can draw a line seperating them as in the above </p>"
                + "<p>example. This seperating line is called a hyperplane. A single neuron can create a single "
                + "hyperplane and the above function can be solved by a single neuron.</p>"
                + "<p> </p>"
                + "<p>Another important point is that the hyperplane above is a straight line, this means we used a linear "
                + "activation function (i.e. a step function) for our neuron. If we used a sigmoid function or similar the </p>"
                + "<p>hyperplane would resemble a sigmoid shape as seen below. (not the best image so please excuse my "
                + "poor paint skills). The hyperplane generated by the image depends on the activation function used.</p>"
                + "<p>The learning rate term is a term that hasnt been mentioned before and is very important, it greatly"
                + "affects the performance and accuracy of your network. I’ll go over this in more detail once we get to </p>"
                + "<p>the weight updates.</p>"
                
                + "<h2> The Multilayer Neural Network </h2>"
                + "<p>As I mentioned before for linearly separable problems a single neuron is sufficient but what about"
                + "problems that have more than one class or ones where data isn’t so well separated like in the </p>"
                + "<p>example below :</p>"
                
                + "<img src = \"file:nlsds.jpg\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<p>Here we need at least two hyper-planes to solve this problem so we need 2 neurons. This requires us "
                + "to link up these neurons together, to link them up we’ll need shared inputs and outputs – in other </p>"
                + "<p>words a multilayer neural network. The standard architecture of a NN consists of 3 layers: an input"
                + "layer, a hidden layer and an output layer. There are several proofs available that you will almost never</p>"
                + "<p>need more than 3 layers (I’ll try get links to the papers soon) and also more importantly we want to"
                + "keep things simple.</p>"
                + "<p>NOTE: you almost never know what your search space looks like, thats why you’re using a neural "
                + "network, often you’ll have to experiment with the neural network architecture in regards to how </p>"
                + "<p>many hidden neurals you need to get a good result.</p>"
                
                + "<h2> A Basic Multilayer Neural Network </h2>"
                
                + "<img src = \"file:bpn.jpg\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<p>Above is a basic multilayer neural network, the inputs are shard and so are the outputs, note that"
                + "each of these links have separate weights. Now what are those square blocks in the neural network? </p>"
                + "<p>They are our thresholds (bias) values, instead of having to store and update separate thresholds for "
                + "each neuron (remember each neuron’s activation function took a weighted sum minus a threshold as</p>"
                + "<p>input) , we simply create 2 extra neurons with a constant value of -1. These neurons are then hooked"
                + "up to the rest of the network and have their own weights (these are technically the threshold values).</p>"
                + "<p> </p>"
                + "<p>This results in the weighted sum + the weight of the threshold multiplied by -1, obviously you can see"
                + "its the same as we had earlier. Now when we update the weights for the network during backpropagation</p>"
                + "<p>we automatically update the thresholds as well, saving us a few calculations and headaches.</p>"
                + "<p> </p>"
                + "<p>The only control over this architecture you have is over the number of hidden neurons since your "
                + "inputs and desired outputs are already known, so deciding on how many hidden neurons you need is</p>"
                + "<p>often a tricky matter, too many is never good, and neither is too little, some careful experimentation "
                + "will often be required to find out an optimal amount of hidden neurons.</p>"
                + "<p> </p>"
                
                + "<h2> The Neuron Error Gradients </h2>"
                + "<p>Okay so obviously we need to update the weights in our neural network to give the correct output at"
                + "the output layer. This forms the basis of training the neural network. We will make use of</p>"
                + "<p>back-propagation for these weight updates. This just means input is fed in, the errors calculated and "
                + "filtered back though the network making changes to the weights to try reduce the error.</p>"
                + "<p> </p>"
                + "<p>The weight changes are calculated by using the gradient descent method. This means we follow the"
                + "steepest path on the error function to try and minimize it. I’m not going to go into the math behind </p>"
                + "<p>gradient descent, the error function and so on since its not really needed, simply put all we’re doing is"
                + "just taking the error at the output neurons (Desired value – actual value) and multiplying it by the </p>"
                + "<p>gradient of the sigmoid function.  If the difference is positive we need to move up the gradient of the"
                + "activation function and if its negative we need to move down the gradient of the activation function.</p>"
                
                + "<img src = \"file:errorgradientsexplanation.png\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<p>This is the formula to calculate the basic error gradient for each output neuron k:</p>"
                
                + "<img src = \"file:egoutput.jpg\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<p>There is a difference between the error gradients at the output and hidden layers. The hidden layer’s "
                + "error gradient is based on the output layer’s error gradient (back propagation) so for the hidden layer</p>"
                + "<p>the error gradient for each hidden neuron is the gradient of the activation function multiplied by the "
                + "weighted sum of the errors at the output layer originating from that neuron </p>"
                
                + "<img src = \"file:eghidden.jpg\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<h2> The Weight Update </h2>"
                + "<p>The final step in the algorithm is to update the weights, this occurs as follows:</p>"
                
                + "<img src = \"file:weightupdates2.jpg\" alt = Perceptron />"
                + "<p> </p>"
                
                + "<p>The alpha value you see above is the learning rate, this is usually a value between 0 and 1</p>"
                + "<p> </p>"
                
                + "<h2> The Learning algorithm </h2>"
                + "<p>The BPN learns during a training epoch, you will probably go through several epochs before the"
                + "network has sufficiently learnt to handle all the data you’ve provided it and the end result is </p>"
                + "<p>satisfactory. A training epoch is described below:</p>"
                + "<p> </p>"
                + "<p>For each input entry in the training data set:</p>"
                + "<ul>"
                + "<li>feed input data in (feed forward)"
                + "<li>check output against desired value and feed back error (back-propagate)"
                + "</ul>"
                + "<p>Where back-propagation consists of :</p>"
                + "<ul>"
                + "<li>calculate error gradients"
                + "<li>update weights"
                + "</ul>"
                + "<p> </p>"
               
                + "<h2> Stopping Conditions </h2>"
                + "<p>These are some commonly used stopping conditions used for neural networks: desired accuracy ,"
                + "desired mean square error and elapsed epochs. I wont go over these in too much detail now as I will </p>"
                + "<p>be covering them in the next tutorial with some training examples. The main reason i’m not going"
                + "into detail here is that i havent described the training of the network in detail, i need to go over the</p>"
                + "<p>creating of training data sets, what generalization and validation errors are and so on. All this will be"
                + "covered in greater detail in the next tutorial.</p>"
                +"<p> </p>"
                + "<h2> Conclusion </h2>"
                + "<p>So this is it  initial tutorial on the basics of neural network.</p>"
                
                /****Description of our approach ************/
                +"<p> </p>"
                +"<hr>"
                +"<h2> How to we approach, Backpropagation Learning can be used in Stock Market Prediction?</h2>"
                +"<p>Now we shows one possible approach how neural networks can be used for stock market prediction."
                +"To show how it works, we trained the network with the NSE (National Stock Exchange) data</p> "
                + "<p>As a strategy we take the sequences from 4 days to predict each 5th day. In the training set 5th "
                + "day is the supervised value.</p>"
                +"<p> </p>"
                + "<p>Now we are normalizing all training data in range (0,1) because in study it found that MLP works "
                + "best when the network inputs and targets are scaled. The following two steps are used for normalizing</p>"
                +"<p> </p>"
                +"<p> 1. Find the max value of training data : maxData.</p>"
                +"<p> 2. Calculate normalized value of all input:</p>"
                +"</p>normData[i]=(data[i]/maxData)*0.8+0.1,where 0.8 and 0.1 will be used to avoid the very small (0.00.....)"
                + " and very big (0.99.....) values.</p>"
                +"<p> </p>"
                +"<p> Next, the network topology is defined: what type of network, how many layers and how many neurons "
                + " per layer used. Actually, there is no rule for this, and usually it is determined experimentally</p>"
                +"<p>A recommendation is to have 2n+1 hidden neurons, where n is the number of input neurons.</p>"
                + "</body> </html>";
        //label1.setToolTipText(s);
        label1.setText(s);
        this.add(label1);
        
    }
    
}
