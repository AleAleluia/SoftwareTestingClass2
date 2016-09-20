
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(short)100, comparator_obj1);
    java.util.stream.Stream<java.lang.Boolean> stream_b3 = priorityqueue_b2.stream();
    boolean b5 = priorityqueue_b2.add((java.lang.Boolean)true);
    java.util.TreeSet<java.lang.Boolean> treeset_b6 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array8 = new java.lang.Boolean[] { true };
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b6, b_array8);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    java.util.Iterator<java.lang.Boolean> iterator_b12 = priorityqueue_b11.iterator();
    boolean b13 = priorityqueue_b2.remove((java.lang.Object)priorityqueue_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)true);
    java.util.Spliterator<java.lang.Boolean> spliterator_b8 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { false, false };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b9, b_array12);
    java.util.Iterator<java.lang.Boolean> iterator_b14 = priorityqueue_b9.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b9);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = priorityqueue_b9.comparator();
    boolean b17 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b9);
    java.util.stream.Stream<java.lang.Boolean> stream_b18 = priorityqueue_b0.parallelStream();
    java.lang.Object[] obj_array19 = priorityqueue_b0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = priorityqueue_b8.comparator();
    java.util.stream.Stream<java.lang.Boolean> stream_b11 = priorityqueue_b8.parallelStream();
    java.lang.Object[] obj_array12 = priorityqueue_b8.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'a', comparator_obj1);
    java.lang.Object[] obj_array3 = priorityqueue_b2.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = priorityqueue_b2.stream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = priorityqueue_b2.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.lang.Boolean b7 = priorityqueue_b6.poll();
    int i8 = priorityqueue_b6.size();
    priorityqueue_b6.clear();
    java.lang.Boolean b10 = priorityqueue_b6.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    priorityqueue_b6.clear();
    java.util.Comparator<java.lang.Boolean> comparator_b8 = priorityqueue_b6.comparator();
    java.lang.Boolean b9 = priorityqueue_b6.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array17 = priorityqueue_b10.toArray(str_array16);
    java.lang.Object obj18 = null;
    boolean b19 = priorityqueue_b10.contains(obj18);
    boolean b20 = priorityqueue_b6.contains((java.lang.Object)b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.util.TreeSet<java.lang.Boolean> treeset_b6 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { true, true };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b6, b_array9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    boolean b12 = priorityqueue_b5.remove((java.lang.Object)treeset_b6);
    java.util.Iterator<java.lang.Boolean> iterator_b13 = priorityqueue_b5.iterator();
    priorityqueue_b5.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array18 = new java.lang.Boolean[] { false, false };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b15, b_array18);
    java.util.Iterator<java.lang.Boolean> iterator_b20 = priorityqueue_b15.iterator();
    boolean b22 = priorityqueue_b15.add((java.lang.Boolean)false);
    priorityqueue_b15.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b24 = priorityqueue_b15.iterator();
    java.lang.Boolean b25 = priorityqueue_b15.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b26 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b15);
    priorityqueue_b15.clear();
    boolean b28 = priorityqueue_b5.contains((java.lang.Object)priorityqueue_b15);
    java.lang.Object obj29 = null;
    boolean b30 = priorityqueue_b15.remove(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b10 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b9);
    boolean b12 = priorityqueue_b0.offer((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj13);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b14);
    boolean b16 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b14);
    java.lang.Object[] obj_array17 = priorityqueue_b14.toArray();
    java.lang.Object obj18 = null;
    boolean b19 = priorityqueue_b14.contains(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)10.0f);
    int i9 = priorityqueue_b6.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { false, false };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b10, b_array13);
    java.util.Iterator<java.lang.Boolean> iterator_b15 = priorityqueue_b10.iterator();
    boolean b17 = priorityqueue_b10.add((java.lang.Boolean)false);
    priorityqueue_b10.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b19 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array22 = new java.lang.Boolean[] { false, false };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b19, b_array22);
    java.util.Iterator<java.lang.Boolean> iterator_b24 = priorityqueue_b19.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b25 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b19);
    java.lang.Boolean b26 = priorityqueue_b25.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b27 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array30 = new java.lang.Boolean[] { false, false };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b27, b_array30);
    priorityqueue_b27.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b33 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array40 = priorityqueue_b33.toArray(str_array39);
    java.lang.String[] str_array41 = priorityqueue_b27.toArray(str_array40);
    boolean b42 = priorityqueue_b25.contains((java.lang.Object)priorityqueue_b27);
    java.lang.String[] str_array48 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array49 = priorityqueue_b27.toArray(str_array48);
    java.lang.String[] str_array50 = priorityqueue_b10.toArray(str_array48);
    java.lang.Boolean b51 = priorityqueue_b10.poll();
    java.lang.Boolean b52 = priorityqueue_b10.poll();
    boolean b53 = priorityqueue_b6.remove((java.lang.Object)b52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b26 + "' != '" + false+ "'", b26.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj1);
    java.util.Comparator<java.lang.Boolean> comparator_b3 = priorityqueue_b2.comparator();
    boolean b5 = priorityqueue_b2.add((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.util.TreeSet<java.lang.Boolean> treeset_b6 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { true, true };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b6, b_array9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    boolean b12 = priorityqueue_b5.remove((java.lang.Object)treeset_b6);
    java.util.Iterator<java.lang.Boolean> iterator_b13 = priorityqueue_b5.iterator();
    priorityqueue_b5.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array18 = new java.lang.Boolean[] { false, false };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b15, b_array18);
    java.util.Iterator<java.lang.Boolean> iterator_b20 = priorityqueue_b15.iterator();
    boolean b22 = priorityqueue_b15.add((java.lang.Boolean)false);
    priorityqueue_b15.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b24 = priorityqueue_b15.iterator();
    java.lang.Boolean b25 = priorityqueue_b15.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b26 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b15);
    priorityqueue_b15.clear();
    boolean b28 = priorityqueue_b5.contains((java.lang.Object)priorityqueue_b15);
    boolean b30 = priorityqueue_b5.add((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.lang.Boolean b12 = priorityqueue_b0.poll();
    java.lang.Boolean b13 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.function.Predicate<java.lang.Object> predicate_obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = priorityqueue_b0.removeIf(predicate_obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b13);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.TreeSet<java.lang.Boolean> treeset_b9 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { true, false };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b9, b_array12);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b9);
    boolean b15 = priorityqueue_b8.remove((java.lang.Object)treeset_b9);
    java.util.stream.Stream<java.lang.Boolean> stream_b16 = treeset_b9.stream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b16);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    int i8 = priorityqueue_b0.size();
    boolean b10 = priorityqueue_b0.offer((java.lang.Boolean)false);
    java.lang.Boolean b11 = priorityqueue_b0.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    priorityqueue_b6.clear();
    boolean b9 = priorityqueue_b6.offer((java.lang.Boolean)true);
    java.util.ArrayList<java.lang.Boolean> arraylist_b10 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { true };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b10, b_array12);
    java.util.stream.Stream<java.lang.Boolean> stream_b14 = arraylist_b10.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b15 = arraylist_b10.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b10);
    java.lang.Boolean b17 = priorityqueue_b16.peek();
    java.lang.Boolean b18 = priorityqueue_b16.peek();
    java.lang.Object[] obj_array19 = priorityqueue_b16.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b20 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b16);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b21 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array24 = new java.lang.Boolean[] { false, false };
    boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b21, b_array24);
    java.util.Iterator<java.lang.Boolean> iterator_b26 = priorityqueue_b21.iterator();
    boolean b28 = priorityqueue_b21.add((java.lang.Boolean)false);
    priorityqueue_b21.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array33 = new java.lang.Boolean[] { false, false };
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b30, b_array33);
    java.util.Iterator<java.lang.Boolean> iterator_b35 = priorityqueue_b30.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b36 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b30);
    java.lang.Boolean b37 = priorityqueue_b36.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b38 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array41 = new java.lang.Boolean[] { false, false };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b38, b_array41);
    priorityqueue_b38.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b44 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array51 = priorityqueue_b44.toArray(str_array50);
    java.lang.String[] str_array52 = priorityqueue_b38.toArray(str_array51);
    boolean b53 = priorityqueue_b36.contains((java.lang.Object)priorityqueue_b38);
    java.lang.String[] str_array59 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array60 = priorityqueue_b38.toArray(str_array59);
    java.lang.String[] str_array61 = priorityqueue_b21.toArray(str_array59);
    boolean b62 = priorityqueue_b20.remove((java.lang.Object)str_array59);
    int i63 = priorityqueue_b20.size();
    java.util.Comparator<java.lang.Object> comparator_obj65 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b66 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj65);
    boolean b68 = priorityqueue_b66.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b69 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b66);
    priorityqueue_b66.clear();
    java.util.Spliterator<java.lang.Boolean> spliterator_b71 = priorityqueue_b66.spliterator();
    boolean b72 = priorityqueue_b20.contains((java.lang.Object)spliterator_b71);
    boolean b73 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b17 + "' != '" + true+ "'", b17.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + true+ "'", b18.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b37 + "' != '" + false+ "'", b37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    int i8 = priorityqueue_b6.size();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = priorityqueue_b6.comparator();
    java.lang.Object[] obj_array10 = priorityqueue_b6.toArray();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b6.iterator();
    boolean b13 = priorityqueue_b6.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b6);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    java.util.Iterator<java.lang.Boolean> iterator_b16 = priorityqueue_b6.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array20 = new java.lang.Boolean[] { false, false };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b17, b_array20);
    java.util.Iterator<java.lang.Boolean> iterator_b22 = priorityqueue_b17.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b23 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b17);
    boolean b25 = priorityqueue_b23.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b26 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array28 = new java.lang.Boolean[] { true };
    boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b26, b_array28);
    java.util.stream.Stream<java.lang.Boolean> stream_b30 = arraylist_b26.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b31 = arraylist_b26.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b32 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b26);
    boolean b33 = priorityqueue_b23.remove((java.lang.Object)priorityqueue_b32);
    java.lang.Object[] obj_array34 = priorityqueue_b23.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b35 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b23);
    java.util.Spliterator<java.lang.Boolean> spliterator_b36 = priorityqueue_b35.spliterator();
    boolean b37 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b8);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    java.util.Comparator<java.lang.Boolean> comparator_b6 = priorityqueue_b0.comparator();
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)true);
    boolean b11 = priorityqueue_b0.add((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    boolean b7 = priorityqueue_b0.contains((java.lang.Object)1L);
    java.util.stream.Stream<java.lang.Boolean> stream_b8 = priorityqueue_b0.parallelStream();
    boolean b10 = priorityqueue_b0.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { false };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b11, b_array13);
    java.util.Iterator<java.lang.Boolean> iterator_b15 = priorityqueue_b11.iterator();
    priorityqueue_b11.clear();
    java.lang.Boolean b17 = priorityqueue_b11.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array21 = new java.lang.Boolean[] { false, false };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b18, b_array21);
    java.util.Iterator<java.lang.Boolean> iterator_b23 = priorityqueue_b18.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b18);
    java.util.Spliterator<java.lang.Boolean> spliterator_b25 = priorityqueue_b18.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b27 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b28 = priorityqueue_b18.remove((java.lang.Object)priorityqueue_b27);
    java.lang.Boolean b29 = priorityqueue_b27.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array33 = new java.lang.Boolean[] { false, false };
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b30, b_array33);
    java.util.Iterator<java.lang.Boolean> iterator_b35 = priorityqueue_b30.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b36 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b30);
    java.lang.Boolean b37 = priorityqueue_b36.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b38 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array41 = new java.lang.Boolean[] { false, false };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b38, b_array41);
    priorityqueue_b38.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b44 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array51 = priorityqueue_b44.toArray(str_array50);
    java.lang.String[] str_array52 = priorityqueue_b38.toArray(str_array51);
    boolean b53 = priorityqueue_b36.contains((java.lang.Object)priorityqueue_b38);
    java.lang.String[] str_array59 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array60 = priorityqueue_b38.toArray(str_array59);
    java.lang.String[] str_array61 = priorityqueue_b27.toArray(str_array59);
    java.lang.String[] str_array62 = priorityqueue_b11.toArray(str_array61);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String[] str_array63 = priorityqueue_b0.toArray(str_array61);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayStoreException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b37 + "' != '" + false+ "'", b37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b3 = priorityqueue_b1.contains((java.lang.Object)"");
    java.util.Spliterator<java.lang.Boolean> spliterator_b4 = priorityqueue_b1.spliterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b5 = priorityqueue_b1.stream();
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b1.parallelStream();
    java.util.TreeSet<java.lang.Boolean> treeset_b7 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array10 = new java.lang.Boolean[] { true, false };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b7, b_array10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b7);
    boolean b13 = priorityqueue_b1.contains((java.lang.Object)priorityqueue_b12);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b1);
    priorityqueue_b1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)' ');
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b1);
    int i3 = priorityqueue_b2.size();
    priorityqueue_b2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    boolean b6 = priorityqueue_b4.offer((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Boolean b12 = priorityqueue_b11.peek();
    java.util.Comparator<java.lang.Boolean> comparator_b13 = priorityqueue_b11.comparator();
    java.util.Comparator<java.lang.Boolean> comparator_b14 = priorityqueue_b11.comparator();
    boolean b16 = priorityqueue_b11.add((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    boolean b8 = priorityqueue_b6.add((java.lang.Boolean)false);
    boolean b10 = priorityqueue_b6.offer((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.lang.Boolean b7 = priorityqueue_b6.poll();
    java.lang.Boolean b8 = priorityqueue_b6.poll();
    boolean b10 = priorityqueue_b6.add((java.lang.Boolean)false);
    java.util.ArrayList<java.lang.Boolean> arraylist_b11 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { true };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b11, b_array13);
    java.util.stream.Stream<java.lang.Boolean> stream_b15 = arraylist_b11.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b11);
    java.util.TreeSet<java.lang.Boolean> treeset_b17 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array20 = new java.lang.Boolean[] { true, true };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b17, b_array20);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b17);
    boolean b23 = priorityqueue_b16.remove((java.lang.Object)treeset_b17);
    java.util.Iterator<java.lang.Boolean> iterator_b24 = priorityqueue_b16.iterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b25 = priorityqueue_b16.parallelStream();
    java.lang.Boolean b26 = priorityqueue_b16.peek();
    boolean b27 = priorityqueue_b6.contains((java.lang.Object)b26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b26 + "' != '" + true+ "'", b26.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj1);
    boolean b4 = priorityqueue_b2.offer((java.lang.Boolean)true);
    int i5 = priorityqueue_b2.size();
    priorityqueue_b2.clear();
    boolean b8 = priorityqueue_b2.offer((java.lang.Boolean)false);
    boolean b10 = priorityqueue_b2.offer((java.lang.Boolean)true);
    java.lang.Boolean b11 = priorityqueue_b2.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    priorityqueue_b0.clear();
    java.util.Spliterator<java.lang.Boolean> spliterator_b6 = priorityqueue_b0.spliterator();
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj9);
    boolean b12 = priorityqueue_b10.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b10);
    priorityqueue_b10.clear();
    boolean b15 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array19 = new java.lang.Boolean[] { false, false };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b16, b_array19);
    java.util.Iterator<java.lang.Boolean> iterator_b21 = priorityqueue_b16.iterator();
    boolean b23 = priorityqueue_b16.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b16);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b25 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b24);
    java.lang.Boolean b26 = priorityqueue_b25.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b27 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b25);
    java.lang.Boolean b28 = priorityqueue_b27.poll();
    boolean b29 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b26 + "' != '" + false+ "'", b26.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b28 + "' != '" + false+ "'", b28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b10 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b9);
    java.util.Comparator<java.lang.Boolean> comparator_b11 = priorityqueue_b0.comparator();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = priorityqueue_b0.comparator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array15 = new java.lang.Boolean[] { false };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b13, b_array15);
    java.util.Iterator<java.lang.Boolean> iterator_b17 = priorityqueue_b13.iterator();
    priorityqueue_b13.clear();
    boolean b20 = priorityqueue_b13.add((java.lang.Boolean)false);
    java.util.stream.Stream<java.lang.Boolean> stream_b21 = priorityqueue_b13.parallelStream();
    boolean b22 = priorityqueue_b0.remove((java.lang.Object)stream_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    java.lang.Object[] obj_array9 = priorityqueue_b6.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    java.util.ArrayList<java.lang.Boolean> arraylist_b11 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { true };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b11, b_array13);
    java.util.stream.Stream<java.lang.Boolean> stream_b15 = arraylist_b11.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b11);
    java.util.TreeSet<java.lang.Boolean> treeset_b17 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array20 = new java.lang.Boolean[] { true, true };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b17, b_array20);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b17);
    boolean b23 = priorityqueue_b16.remove((java.lang.Object)treeset_b17);
    java.util.Spliterator<java.lang.Boolean> spliterator_b24 = treeset_b17.spliterator();
    java.util.Spliterator<java.lang.Boolean> spliterator_b25 = treeset_b17.spliterator();
    boolean b26 = priorityqueue_b10.remove((java.lang.Object)treeset_b17);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b27 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj1);
    boolean b4 = priorityqueue_b2.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b5);
    java.lang.Object[] obj_array7 = priorityqueue_b5.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)false);
    java.util.stream.Stream<java.lang.Boolean> stream_b10 = priorityqueue_b0.parallelStream();
    int i11 = priorityqueue_b0.size();
    int i12 = priorityqueue_b0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'a', comparator_obj1);
    java.util.Comparator<java.lang.Boolean> comparator_b3 = priorityqueue_b2.comparator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b2);
    java.lang.Object[] obj_array5 = priorityqueue_b4.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    boolean b7 = priorityqueue_b5.offer((java.lang.Boolean)false);
    java.lang.Boolean b8 = priorityqueue_b5.poll();
    java.lang.Object obj9 = null;
    boolean b10 = priorityqueue_b5.contains(obj9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(2);
    boolean b13 = priorityqueue_b5.remove((java.lang.Object)priorityqueue_b12);
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = priorityqueue_b12.spliterator();
    java.lang.Object[] obj_array15 = priorityqueue_b12.toArray();
    java.lang.Boolean b16 = priorityqueue_b12.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b16);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    boolean b6 = priorityqueue_b0.offer((java.lang.Boolean)false);
    java.util.Iterator<java.lang.Boolean> iterator_b7 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.function.Predicate<java.lang.Object> predicate_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = priorityqueue_b0.removeIf(predicate_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b7);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    boolean b9 = priorityqueue_b0.offer((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    int i7 = priorityqueue_b6.size();
    boolean b9 = priorityqueue_b6.remove((java.lang.Object)(short)100);
    java.lang.Boolean b10 = priorityqueue_b6.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + false+ "'", b10.equals(false));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b8);
    java.util.Iterator<java.lang.Boolean> iterator_b10 = priorityqueue_b8.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b10);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(short)100);
    boolean b3 = priorityqueue_b1.add((java.lang.Boolean)true);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b1.iterator();
    boolean b6 = priorityqueue_b1.add((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array8 = new java.lang.Boolean[] { false };
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b6, b_array8);
    java.util.Iterator<java.lang.Boolean> iterator_b10 = priorityqueue_b6.iterator();
    priorityqueue_b6.clear();
    java.lang.Boolean b12 = priorityqueue_b6.poll();
    boolean b13 = priorityqueue_b5.remove((java.lang.Object)priorityqueue_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = priorityqueue_b6.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b14);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj13);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b14);
    boolean b16 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b14);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b14);
    java.util.Iterator<java.lang.Boolean> iterator_b18 = priorityqueue_b14.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b18);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.Iterator<java.lang.Boolean> iterator_b6 = priorityqueue_b5.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b5);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b6);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b11 = priorityqueue_b10.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b11);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    java.lang.Object[] obj_array17 = priorityqueue_b6.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    java.lang.Object[] obj_array19 = priorityqueue_b6.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    java.lang.Boolean b6 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { false };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b7, b_array9);
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b7.iterator();
    priorityqueue_b7.clear();
    java.lang.Boolean b13 = priorityqueue_b7.poll();
    java.lang.Boolean b14 = priorityqueue_b7.peek();
    boolean b15 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b7);
    java.util.stream.Stream<java.lang.Boolean> stream_b16 = priorityqueue_b7.stream();
    java.util.Comparator<java.lang.Boolean> comparator_b17 = priorityqueue_b7.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b17);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Object[] obj_array8 = priorityqueue_b6.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    boolean b7 = priorityqueue_b5.offer((java.lang.Boolean)false);
    java.lang.Boolean b8 = priorityqueue_b5.poll();
    java.lang.Object obj9 = null;
    boolean b10 = priorityqueue_b5.contains(obj9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(2);
    boolean b13 = priorityqueue_b5.remove((java.lang.Object)priorityqueue_b12);
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = priorityqueue_b12.spliterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b15 = priorityqueue_b12.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b15);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    boolean b7 = priorityqueue_b0.contains((java.lang.Object)1L);
    java.util.Spliterator<java.lang.Boolean> spliterator_b8 = priorityqueue_b0.spliterator();
    java.lang.Object[] obj_array9 = priorityqueue_b0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj13);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b14);
    boolean b16 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b14);
    java.util.function.Consumer<java.lang.Object> consumer_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    priorityqueue_b0.forEach(consumer_obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(10, comparator_obj1);
    java.util.Spliterator<java.lang.Boolean> spliterator_b3 = priorityqueue_b2.spliterator();
    java.util.ArrayList<java.lang.Boolean> arraylist_b4 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array6 = new java.lang.Boolean[] { true };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b4, b_array6);
    java.util.stream.Stream<java.lang.Boolean> stream_b8 = arraylist_b4.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b4);
    boolean b10 = priorityqueue_b2.contains((java.lang.Object)arraylist_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    boolean b7 = priorityqueue_b0.contains((java.lang.Object)1L);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = priorityqueue_b0.comparator();
    java.lang.Boolean b9 = priorityqueue_b0.poll();
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(short)1, comparator_obj11);
    java.util.ArrayList<java.lang.Boolean> arraylist_b13 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array15 = new java.lang.Boolean[] { true };
    boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b13, b_array15);
    java.util.stream.Stream<java.lang.Boolean> stream_b17 = arraylist_b13.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b18 = arraylist_b13.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b19 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b13);
    java.lang.Boolean b20 = priorityqueue_b19.peek();
    java.lang.Boolean b21 = priorityqueue_b19.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array25 = new java.lang.Boolean[] { false, false };
    boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b22, b_array25);
    priorityqueue_b22.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b28 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array35 = priorityqueue_b28.toArray(str_array34);
    java.lang.String[] str_array36 = priorityqueue_b22.toArray(str_array35);
    boolean b37 = priorityqueue_b19.contains((java.lang.Object)str_array35);
    java.lang.String[] str_array38 = priorityqueue_b12.toArray(str_array35);
    java.lang.String[] str_array39 = priorityqueue_b0.toArray(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b20 + "' != '" + true+ "'", b20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + true+ "'", b21.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array7 = new java.lang.Boolean[] { false };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b5, b_array7);
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b5.iterator();
    priorityqueue_b5.clear();
    java.lang.Boolean b11 = priorityqueue_b5.poll();
    boolean b13 = priorityqueue_b5.contains((java.lang.Object)100.0d);
    java.util.stream.Stream<java.lang.Boolean> stream_b14 = priorityqueue_b5.stream();
    boolean b15 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    java.util.Spliterator<java.lang.Boolean> spliterator_b19 = priorityqueue_b18.spliterator();
    boolean b20 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b18);
    java.lang.Boolean b21 = priorityqueue_b18.peek();
    boolean b23 = priorityqueue_b18.add((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)1, comparator_obj1);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b3 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array6 = new java.lang.Boolean[] { false, false };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b3, b_array6);
    java.util.Iterator<java.lang.Boolean> iterator_b8 = priorityqueue_b3.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b3);
    java.lang.Boolean b10 = priorityqueue_b9.peek();
    int i11 = priorityqueue_b9.size();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = priorityqueue_b9.comparator();
    java.lang.Object[] obj_array13 = priorityqueue_b9.toArray();
    java.util.Iterator<java.lang.Boolean> iterator_b14 = priorityqueue_b9.iterator();
    boolean b16 = priorityqueue_b9.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b9);
    java.lang.Object[] obj_array18 = priorityqueue_b17.toArray();
    boolean b19 = priorityqueue_b2.contains((java.lang.Object)obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + false+ "'", b10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.TreeSet<java.lang.Boolean> treeset_b4 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array6 = new java.lang.Boolean[] { true };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b4, b_array6);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b4);
    boolean b9 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b8);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    priorityqueue_b0.clear();
    java.util.Spliterator<java.lang.Boolean> spliterator_b12 = priorityqueue_b0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b12);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b11 = priorityqueue_b10.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b10);
    java.util.Iterator<java.lang.Boolean> iterator_b13 = priorityqueue_b12.iterator();
    boolean b15 = priorityqueue_b12.offer((java.lang.Boolean)true);
    java.lang.Object[] obj_array16 = priorityqueue_b12.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.lang.Boolean b12 = priorityqueue_b0.poll();
    java.lang.Boolean b13 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b16 = priorityqueue_b14.offer((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b13 = priorityqueue_b11.add((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b3 = priorityqueue_b1.contains((java.lang.Object)"");
    java.util.Spliterator<java.lang.Boolean> spliterator_b4 = priorityqueue_b1.spliterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b5 = priorityqueue_b1.stream();
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b1.parallelStream();
    java.util.TreeSet<java.lang.Boolean> treeset_b7 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array10 = new java.lang.Boolean[] { true, false };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b7, b_array10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b7);
    boolean b13 = priorityqueue_b1.contains((java.lang.Object)priorityqueue_b12);
    priorityqueue_b1.clear();
    java.util.Spliterator<java.lang.Boolean> spliterator_b15 = priorityqueue_b1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b15);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { false, false };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b8, b_array11);
    priorityqueue_b8.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array21 = priorityqueue_b14.toArray(str_array20);
    java.lang.String[] str_array22 = priorityqueue_b8.toArray(str_array21);
    boolean b23 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b8);
    java.lang.String[] str_array29 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array30 = priorityqueue_b8.toArray(str_array29);
    int i31 = priorityqueue_b8.size();
    java.lang.Boolean b32 = priorityqueue_b8.poll();
    java.util.ArrayList<java.lang.Boolean> arraylist_b33 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array35 = new java.lang.Boolean[] { true };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b33, b_array35);
    java.util.stream.Stream<java.lang.Boolean> stream_b37 = arraylist_b33.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b38 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b33);
    java.util.TreeSet<java.lang.Boolean> treeset_b39 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array42 = new java.lang.Boolean[] { true, true };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b39, b_array42);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b44 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b39);
    boolean b45 = priorityqueue_b38.remove((java.lang.Object)treeset_b39);
    java.util.Iterator<java.lang.Boolean> iterator_b46 = priorityqueue_b38.iterator();
    priorityqueue_b38.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b48 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array51 = new java.lang.Boolean[] { false, false };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b48, b_array51);
    java.util.Iterator<java.lang.Boolean> iterator_b53 = priorityqueue_b48.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b54 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b48);
    java.lang.Boolean b55 = priorityqueue_b54.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b56 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array59 = new java.lang.Boolean[] { false, false };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b56, b_array59);
    priorityqueue_b56.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b62 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array68 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array69 = priorityqueue_b62.toArray(str_array68);
    java.lang.String[] str_array70 = priorityqueue_b56.toArray(str_array69);
    boolean b71 = priorityqueue_b54.contains((java.lang.Object)priorityqueue_b56);
    java.lang.String[] str_array77 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array78 = priorityqueue_b56.toArray(str_array77);
    java.lang.String[] str_array79 = priorityqueue_b38.toArray(str_array78);
    java.lang.String[] str_array80 = priorityqueue_b8.toArray(str_array79);
    java.lang.Boolean b81 = priorityqueue_b8.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b55 + "' != '" + false+ "'", b55.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b81);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(short)10);
    java.util.stream.Stream<java.lang.Boolean> stream_b2 = priorityqueue_b1.parallelStream();
    java.util.function.Consumer<java.lang.Object> consumer_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    priorityqueue_b1.forEach(consumer_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b2);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b10 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b9);
    java.lang.Boolean b11 = priorityqueue_b9.peek();
    java.lang.Boolean b12 = priorityqueue_b9.peek();
    java.util.Spliterator<java.lang.Boolean> spliterator_b13 = priorityqueue_b9.spliterator();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = priorityqueue_b9.spliterator();
    int i15 = priorityqueue_b9.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'4');
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array5 = new java.lang.Boolean[] { false, false };
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b2, b_array5);
    java.util.Iterator<java.lang.Boolean> iterator_b7 = priorityqueue_b2.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b2);
    boolean b9 = priorityqueue_b1.remove((java.lang.Object)priorityqueue_b2);
    java.util.Iterator<java.lang.Boolean> iterator_b10 = priorityqueue_b1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b10);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100, comparator_obj1);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b3 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b2);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)true);
    java.util.Spliterator<java.lang.Boolean> spliterator_b8 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { false, false };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b9, b_array12);
    java.util.Iterator<java.lang.Boolean> iterator_b14 = priorityqueue_b9.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b9);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = priorityqueue_b9.comparator();
    boolean b17 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b9);
    java.util.stream.Stream<java.lang.Boolean> stream_b18 = priorityqueue_b9.stream();
    boolean b20 = priorityqueue_b9.add((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    java.util.Comparator<java.lang.Boolean> comparator_b6 = priorityqueue_b0.comparator();
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Object[] obj_array11 = priorityqueue_b0.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    priorityqueue_b0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.util.TreeSet<java.lang.Boolean> treeset_b6 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { true, true };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b6, b_array9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    boolean b12 = priorityqueue_b5.remove((java.lang.Object)treeset_b6);
    java.util.Iterator<java.lang.Boolean> iterator_b13 = priorityqueue_b5.iterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b14 = priorityqueue_b5.parallelStream();
    java.util.function.Consumer<java.lang.Object> consumer_obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    priorityqueue_b5.forEach(consumer_obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b14);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { false };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b7, b_array9);
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b7.iterator();
    java.lang.Object[] obj_array12 = priorityqueue_b7.toArray();
    boolean b13 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b7);
    java.util.stream.Stream<java.lang.Boolean> stream_b14 = priorityqueue_b7.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b14);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    java.lang.Boolean b6 = priorityqueue_b0.poll();
    boolean b8 = priorityqueue_b0.contains((java.lang.Object)100.0d);
    java.util.stream.Stream<java.lang.Boolean> stream_b9 = priorityqueue_b0.stream();
    java.util.TreeSet<java.lang.Boolean> treeset_b10 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { true, true };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b10, b_array13);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    boolean b18 = priorityqueue_b0.contains((java.lang.Object)treeset_b10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b19 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b20 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    priorityqueue_b0.clear();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(short)1, comparator_obj9);
    java.util.ArrayList<java.lang.Boolean> arraylist_b11 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { true };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b11, b_array13);
    java.util.stream.Stream<java.lang.Boolean> stream_b15 = arraylist_b11.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b16 = arraylist_b11.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b11);
    java.lang.Boolean b18 = priorityqueue_b17.peek();
    java.lang.Boolean b19 = priorityqueue_b17.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b20 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array23 = new java.lang.Boolean[] { false, false };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b20, b_array23);
    priorityqueue_b20.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b26 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array33 = priorityqueue_b26.toArray(str_array32);
    java.lang.String[] str_array34 = priorityqueue_b20.toArray(str_array33);
    boolean b35 = priorityqueue_b17.contains((java.lang.Object)str_array33);
    java.lang.String[] str_array36 = priorityqueue_b10.toArray(str_array33);
    boolean b37 = priorityqueue_b0.remove((java.lang.Object)str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + true+ "'", b18.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b19 + "' != '" + true+ "'", b19.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    int i8 = priorityqueue_b0.size();
    boolean b10 = priorityqueue_b0.offer((java.lang.Boolean)false);
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b12 = priorityqueue_b0.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b12);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    boolean b10 = priorityqueue_b6.remove((java.lang.Object)(short)1);
    java.lang.Object[] obj_array11 = priorityqueue_b6.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b6);
    java.util.Iterator<java.lang.Boolean> iterator_b13 = priorityqueue_b12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b13);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    boolean b10 = priorityqueue_b6.remove((java.lang.Object)(short)1);
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b6.iterator();
    java.util.Spliterator<java.lang.Boolean> spliterator_b12 = priorityqueue_b6.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    boolean b15 = priorityqueue_b13.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array18 = new java.lang.Boolean[] { false };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b16, b_array18);
    java.util.Iterator<java.lang.Boolean> iterator_b20 = priorityqueue_b16.iterator();
    priorityqueue_b16.clear();
    boolean b23 = priorityqueue_b16.contains((java.lang.Object)1L);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b25 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'4');
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b26 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array29 = new java.lang.Boolean[] { false, false };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b26, b_array29);
    java.util.Iterator<java.lang.Boolean> iterator_b31 = priorityqueue_b26.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b32 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b26);
    boolean b33 = priorityqueue_b25.remove((java.lang.Object)priorityqueue_b26);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b34 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b26);
    boolean b35 = priorityqueue_b16.remove((java.lang.Object)priorityqueue_b34);
    java.util.Spliterator<java.lang.Boolean> spliterator_b36 = priorityqueue_b16.spliterator();
    boolean b37 = priorityqueue_b13.contains((java.lang.Object)priorityqueue_b16);
    boolean b39 = priorityqueue_b16.add((java.lang.Boolean)false);
    java.lang.Object[] obj_array40 = priorityqueue_b16.toArray();
    java.lang.Boolean b41 = priorityqueue_b16.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b41 + "' != '" + false+ "'", b41.equals(false));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    java.lang.Object[] obj_array17 = priorityqueue_b6.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    java.lang.Boolean b19 = priorityqueue_b18.peek();
    priorityqueue_b18.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b19 + "' != '" + false+ "'", b19.equals(false));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.util.TreeSet<java.lang.Boolean> treeset_b6 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { true, true };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b6, b_array9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    boolean b12 = priorityqueue_b5.remove((java.lang.Object)treeset_b6);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    int i14 = priorityqueue_b13.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { false, false };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b9, b_array12);
    java.util.Iterator<java.lang.Boolean> iterator_b14 = priorityqueue_b9.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b9);
    java.lang.Boolean b16 = priorityqueue_b15.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array20 = new java.lang.Boolean[] { false, false };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b17, b_array20);
    priorityqueue_b17.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b23 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array30 = priorityqueue_b23.toArray(str_array29);
    java.lang.String[] str_array31 = priorityqueue_b17.toArray(str_array30);
    boolean b32 = priorityqueue_b15.contains((java.lang.Object)priorityqueue_b17);
    java.lang.String[] str_array38 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array39 = priorityqueue_b17.toArray(str_array38);
    java.lang.String[] str_array40 = priorityqueue_b0.toArray(str_array38);
    java.lang.Boolean b41 = priorityqueue_b0.poll();
    java.lang.Boolean b42 = priorityqueue_b0.poll();
    java.lang.Object[] obj_array43 = priorityqueue_b0.toArray();
    java.util.Comparator<java.lang.Boolean> comparator_b44 = priorityqueue_b0.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b16 + "' != '" + false+ "'", b16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b44);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)1);
    boolean b3 = priorityqueue_b1.remove((java.lang.Object)10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array7 = new java.lang.Boolean[] { false, false };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b4, b_array7);
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b4.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b4);
    java.util.Spliterator<java.lang.Boolean> spliterator_b11 = priorityqueue_b4.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b14 = priorityqueue_b4.remove((java.lang.Object)priorityqueue_b13);
    java.lang.Boolean b15 = priorityqueue_b13.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array19 = new java.lang.Boolean[] { false, false };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b16, b_array19);
    java.util.Iterator<java.lang.Boolean> iterator_b21 = priorityqueue_b16.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b16);
    java.lang.Boolean b23 = priorityqueue_b22.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array27 = new java.lang.Boolean[] { false, false };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b24, b_array27);
    priorityqueue_b24.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array37 = priorityqueue_b30.toArray(str_array36);
    java.lang.String[] str_array38 = priorityqueue_b24.toArray(str_array37);
    boolean b39 = priorityqueue_b22.contains((java.lang.Object)priorityqueue_b24);
    java.lang.String[] str_array45 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array46 = priorityqueue_b24.toArray(str_array45);
    java.lang.String[] str_array47 = priorityqueue_b13.toArray(str_array45);
    java.lang.String[] str_array48 = priorityqueue_b1.toArray(str_array45);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b49 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b1);
    java.util.Comparator<java.lang.Boolean> comparator_b50 = priorityqueue_b49.comparator();
    int i51 = priorityqueue_b49.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b23 + "' != '" + false+ "'", b23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'4');
    java.lang.Boolean b2 = priorityqueue_b1.poll();
    int i3 = priorityqueue_b1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    priorityqueue_b6.clear();
    boolean b9 = priorityqueue_b6.contains((java.lang.Object)10);
    java.util.function.Consumer<java.lang.Object> consumer_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    priorityqueue_b6.forEach(consumer_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b8);
    java.lang.Boolean b10 = priorityqueue_b9.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b9);
    boolean b13 = priorityqueue_b9.offer((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + false+ "'", b10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    java.lang.Object[] obj_array17 = priorityqueue_b6.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    java.util.Spliterator<java.lang.Boolean> spliterator_b19 = priorityqueue_b18.spliterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b20 = priorityqueue_b18.parallelStream();
    java.lang.Boolean b21 = priorityqueue_b18.peek();
    java.lang.Boolean b22 = priorityqueue_b18.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b22 + "' != '" + false+ "'", b22.equals(false));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    priorityqueue_b0.clear();
    java.lang.Object[] obj_array6 = priorityqueue_b0.toArray();
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    priorityqueue_b0.clear();
    priorityqueue_b0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b7);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { false, false };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b9, b_array12);
    java.util.Iterator<java.lang.Boolean> iterator_b14 = priorityqueue_b9.iterator();
    boolean b16 = priorityqueue_b9.add((java.lang.Boolean)true);
    java.util.Spliterator<java.lang.Boolean> spliterator_b17 = priorityqueue_b9.spliterator();
    boolean b18 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b9);
    int i19 = priorityqueue_b9.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj1);
    boolean b4 = priorityqueue_b2.offer((java.lang.Boolean)true);
    int i5 = priorityqueue_b2.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b9 = priorityqueue_b7.contains((java.lang.Object)"");
    boolean b11 = priorityqueue_b7.remove((java.lang.Object)(byte)10);
    boolean b12 = priorityqueue_b2.remove((java.lang.Object)priorityqueue_b7);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b7);
    java.util.TreeSet<java.lang.Boolean> treeset_b14 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array17 = new java.lang.Boolean[] { true, true };
    boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b14, b_array17);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b19 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b14);
    java.util.stream.Stream<java.lang.Boolean> stream_b20 = priorityqueue_b19.parallelStream();
    java.lang.Object[] obj_array21 = priorityqueue_b19.toArray();
    boolean b22 = priorityqueue_b7.remove((java.lang.Object)priorityqueue_b19);
    java.lang.Object[] obj_array23 = priorityqueue_b19.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    java.util.stream.Stream<java.lang.Boolean> stream_b2 = priorityqueue_b1.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b3 = priorityqueue_b1.spliterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = priorityqueue_b1.stream();
    java.util.stream.Stream<java.lang.Boolean> stream_b5 = priorityqueue_b1.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b5);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj1);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b3 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array7 = new java.lang.Boolean[] { false, false };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b4, b_array7);
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b4.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b4);
    java.util.Spliterator<java.lang.Boolean> spliterator_b11 = priorityqueue_b4.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b14 = priorityqueue_b4.remove((java.lang.Object)priorityqueue_b13);
    java.lang.Boolean b15 = priorityqueue_b13.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array19 = new java.lang.Boolean[] { false, false };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b16, b_array19);
    java.util.Iterator<java.lang.Boolean> iterator_b21 = priorityqueue_b16.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b16);
    java.lang.Boolean b23 = priorityqueue_b22.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array27 = new java.lang.Boolean[] { false, false };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b24, b_array27);
    priorityqueue_b24.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array37 = priorityqueue_b30.toArray(str_array36);
    java.lang.String[] str_array38 = priorityqueue_b24.toArray(str_array37);
    boolean b39 = priorityqueue_b22.contains((java.lang.Object)priorityqueue_b24);
    java.lang.String[] str_array45 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array46 = priorityqueue_b24.toArray(str_array45);
    java.lang.String[] str_array47 = priorityqueue_b13.toArray(str_array45);
    java.lang.String[] str_array48 = priorityqueue_b2.toArray(str_array47);
    java.util.Comparator<java.lang.Boolean> comparator_b49 = priorityqueue_b2.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b23 + "' != '" + false+ "'", b23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b49);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.lang.Boolean b12 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b12 = priorityqueue_b0.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b12 + "' != '" + false+ "'", b12.equals(false));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    boolean b7 = priorityqueue_b5.add((java.lang.Boolean)true);
    boolean b9 = priorityqueue_b5.contains((java.lang.Object)10);
    java.util.Spliterator<java.lang.Boolean> spliterator_b10 = priorityqueue_b5.spliterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b11 = priorityqueue_b5.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b11);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'a', comparator_obj1);
    java.util.Comparator<java.lang.Boolean> comparator_b3 = priorityqueue_b2.comparator();
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = priorityqueue_b2.stream();
    java.util.stream.Stream<java.lang.Boolean> stream_b5 = priorityqueue_b2.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b5);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(3, comparator_obj1);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b3 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b4 = priorityqueue_b3.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b4);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    boolean b10 = priorityqueue_b6.remove((java.lang.Object)(short)1);
    java.lang.Object[] obj_array11 = priorityqueue_b6.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b12 = priorityqueue_b6.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b12);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    priorityqueue_b0.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100);
    boolean b15 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj1);
    boolean b4 = priorityqueue_b2.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b2);
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b2.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { false };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b7, b_array9);
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b7.iterator();
    java.lang.Object[] obj_array12 = priorityqueue_b7.toArray();
    boolean b13 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b7);
    java.util.Iterator<java.lang.Boolean> iterator_b14 = priorityqueue_b7.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b14);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b15);
    boolean b19 = priorityqueue_b17.offer((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b20 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array23 = new java.lang.Boolean[] { true, false };
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b20, b_array23);
    int i25 = priorityqueue_b20.size();
    java.lang.Boolean b26 = priorityqueue_b20.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b27 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array30 = new java.lang.Boolean[] { false, false };
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b27, b_array30);
    java.util.Iterator<java.lang.Boolean> iterator_b32 = priorityqueue_b27.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b33 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b27);
    java.util.Spliterator<java.lang.Boolean> spliterator_b34 = priorityqueue_b27.spliterator();
    boolean b35 = priorityqueue_b20.contains((java.lang.Object)spliterator_b34);
    boolean b36 = priorityqueue_b17.contains((java.lang.Object)b35);
    boolean b38 = priorityqueue_b17.offer((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b26 + "' != '" + false+ "'", b26.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    java.lang.Object[] obj_array9 = priorityqueue_b6.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b6);
    boolean b13 = priorityqueue_b6.add((java.lang.Boolean)true);
    java.util.stream.Stream<java.lang.Boolean> stream_b14 = priorityqueue_b6.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b14);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    int i8 = priorityqueue_b6.size();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    boolean b10 = priorityqueue_b6.remove((java.lang.Object)(short)1);
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b6.iterator();
    java.util.Spliterator<java.lang.Boolean> spliterator_b12 = priorityqueue_b6.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = priorityqueue_b13.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.stream.Stream<java.lang.Boolean> stream_b8 = treeset_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.lang.Boolean b11 = priorityqueue_b10.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + true+ "'", b11.equals(true));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b0.iterator();
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj13);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b14);
    boolean b16 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b14);
    java.lang.Boolean b17 = priorityqueue_b0.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b17);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.lang.Boolean b7 = priorityqueue_b6.poll();
    int i8 = priorityqueue_b6.size();
    priorityqueue_b6.clear();
    java.util.stream.Stream<java.lang.Boolean> stream_b10 = priorityqueue_b6.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b10);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    int i8 = priorityqueue_b0.size();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array14 = new java.lang.Boolean[] { false, false };
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b11, b_array14);
    java.util.Iterator<java.lang.Boolean> iterator_b16 = priorityqueue_b11.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b11);
    boolean b19 = priorityqueue_b17.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b20 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array22 = new java.lang.Boolean[] { true };
    boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b20, b_array22);
    java.util.stream.Stream<java.lang.Boolean> stream_b24 = arraylist_b20.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b25 = arraylist_b20.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b26 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b20);
    boolean b27 = priorityqueue_b17.remove((java.lang.Object)priorityqueue_b26);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b28 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b26);
    boolean b29 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b26);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array33 = new java.lang.Boolean[] { false, false };
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b30, b_array33);
    priorityqueue_b30.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b36 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array43 = priorityqueue_b36.toArray(str_array42);
    java.lang.String[] str_array44 = priorityqueue_b30.toArray(str_array43);
    java.lang.String[] str_array45 = priorityqueue_b0.toArray(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b5.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array10 = new java.lang.Boolean[] { false, false };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b7, b_array10);
    java.util.Iterator<java.lang.Boolean> iterator_b12 = priorityqueue_b7.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b7);
    java.lang.Boolean b14 = priorityqueue_b13.peek();
    int i15 = priorityqueue_b13.size();
    java.util.Spliterator<java.lang.Boolean> spliterator_b16 = priorityqueue_b13.spliterator();
    boolean b17 = priorityqueue_b5.contains((java.lang.Object)priorityqueue_b13);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b13);
    int i19 = priorityqueue_b13.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj1);
    boolean b4 = priorityqueue_b2.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b5);
    int i7 = priorityqueue_b6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    java.util.Spliterator<java.lang.Boolean> spliterator_b19 = priorityqueue_b18.spliterator();
    boolean b20 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b18);
    java.lang.Boolean b21 = priorityqueue_b18.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b18);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b23 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array26 = new java.lang.Boolean[] { false, false };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b23, b_array26);
    java.util.Iterator<java.lang.Boolean> iterator_b28 = priorityqueue_b23.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b29 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b23);
    java.lang.Boolean b30 = priorityqueue_b29.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b31 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array34 = new java.lang.Boolean[] { false, false };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b31, b_array34);
    priorityqueue_b31.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b37 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array44 = priorityqueue_b37.toArray(str_array43);
    java.lang.String[] str_array45 = priorityqueue_b31.toArray(str_array44);
    boolean b46 = priorityqueue_b29.contains((java.lang.Object)priorityqueue_b31);
    java.lang.String[] str_array52 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array53 = priorityqueue_b31.toArray(str_array52);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b54 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array61 = priorityqueue_b54.toArray(str_array60);
    java.lang.String[] str_array62 = priorityqueue_b31.toArray(str_array61);
    java.lang.String[] str_array63 = priorityqueue_b18.toArray(str_array61);
    boolean b65 = priorityqueue_b18.add((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b30 + "' != '" + false+ "'", b30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    priorityqueue_b0.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b0.iterator();
    java.lang.Boolean b10 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Boolean b12 = priorityqueue_b0.poll();
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = priorityqueue_b0.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)1);
    boolean b3 = priorityqueue_b1.remove((java.lang.Object)10);
    priorityqueue_b1.clear();
    java.lang.Object[] obj_array5 = priorityqueue_b1.toArray();
    java.lang.Object[] obj_array6 = priorityqueue_b1.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b1);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b10 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b9);
    java.lang.Boolean b11 = priorityqueue_b9.peek();
    java.lang.Boolean b12 = priorityqueue_b9.peek();
    java.util.Spliterator<java.lang.Boolean> spliterator_b13 = priorityqueue_b9.spliterator();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = priorityqueue_b9.spliterator();
    java.util.Comparator<java.lang.Boolean> comparator_b15 = priorityqueue_b9.comparator();
    java.util.stream.Stream<java.lang.Boolean> stream_b16 = priorityqueue_b9.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b16);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.lang.Boolean b7 = priorityqueue_b6.poll();
    java.lang.Boolean b8 = priorityqueue_b6.poll();
    boolean b10 = priorityqueue_b6.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b6);
    int i12 = priorityqueue_b11.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.offer((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    boolean b7 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b8);
    java.lang.Object obj10 = null;
    boolean b11 = priorityqueue_b8.remove(obj10);
    int i12 = priorityqueue_b8.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    java.lang.Boolean b9 = priorityqueue_b6.poll();
    java.util.stream.Stream<java.lang.Boolean> stream_b10 = priorityqueue_b6.stream();
    boolean b12 = priorityqueue_b6.offer((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + true+ "'", b9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    java.lang.Boolean b9 = priorityqueue_b6.poll();
    java.util.stream.Stream<java.lang.Boolean> stream_b10 = priorityqueue_b6.stream();
    java.lang.Object[] obj_array11 = priorityqueue_b6.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + true+ "'", b9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.Iterator<java.lang.Boolean> iterator_b6 = priorityqueue_b5.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b5);
    priorityqueue_b5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b6);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    boolean b9 = priorityqueue_b0.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { false, false };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b10, b_array13);
    java.util.Iterator<java.lang.Boolean> iterator_b15 = priorityqueue_b10.iterator();
    boolean b17 = priorityqueue_b10.add((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b18 = priorityqueue_b10.comparator();
    boolean b19 = priorityqueue_b0.contains((java.lang.Object)comparator_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    java.util.stream.Stream<java.lang.Boolean> stream_b2 = priorityqueue_b1.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b3 = priorityqueue_b1.spliterator();
    java.util.ArrayList<java.lang.Boolean> arraylist_b4 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array6 = new java.lang.Boolean[] { true };
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b4, b_array6);
    java.util.stream.Stream<java.lang.Boolean> stream_b8 = arraylist_b4.parallelStream();
    boolean b9 = priorityqueue_b1.contains((java.lang.Object)arraylist_b4);
    java.util.stream.Stream<java.lang.Boolean> stream_b10 = arraylist_b4.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b10);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    java.util.Spliterator<java.lang.Boolean> spliterator_b19 = priorityqueue_b18.spliterator();
    boolean b20 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b18);
    java.lang.Boolean b21 = priorityqueue_b18.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b18);
    java.util.stream.Stream<java.lang.Boolean> stream_b23 = priorityqueue_b22.stream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b24 = priorityqueue_b22.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b24);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    int i8 = priorityqueue_b6.size();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = priorityqueue_b6.comparator();
    java.lang.Object[] obj_array10 = priorityqueue_b6.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b11 = priorityqueue_b6.parallelStream();
    java.lang.Boolean b12 = priorityqueue_b6.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b12 + "' != '" + false+ "'", b12.equals(false));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    priorityqueue_b0.clear();
    java.lang.Object[] obj_array6 = priorityqueue_b0.toArray();
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    priorityqueue_b0.clear();
    java.util.stream.Stream<java.lang.Boolean> stream_b9 = priorityqueue_b0.parallelStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b9);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    java.lang.Boolean b6 = priorityqueue_b0.poll();
    boolean b8 = priorityqueue_b0.contains((java.lang.Object)100.0d);
    java.util.stream.Stream<java.lang.Boolean> stream_b9 = priorityqueue_b0.stream();
    java.util.TreeSet<java.lang.Boolean> treeset_b10 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { true, true };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b10, b_array13);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b10);
    boolean b18 = priorityqueue_b0.contains((java.lang.Object)treeset_b10);
    java.lang.Boolean b19 = priorityqueue_b0.poll();
    java.lang.Boolean b20 = priorityqueue_b0.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b20);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array7 = priorityqueue_b0.toArray(str_array6);
    int i8 = priorityqueue_b0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    int i8 = priorityqueue_b6.size();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = priorityqueue_b6.comparator();
    java.lang.Object[] obj_array10 = priorityqueue_b6.toArray();
    java.util.Iterator<java.lang.Boolean> iterator_b11 = priorityqueue_b6.iterator();
    boolean b13 = priorityqueue_b6.add((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b6);
    java.lang.Object[] obj_array15 = priorityqueue_b14.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b16 = priorityqueue_b14.stream();
    java.lang.Object[] obj_array17 = priorityqueue_b14.toArray();
    boolean b19 = priorityqueue_b14.offer((java.lang.Boolean)false);
    java.lang.Boolean b20 = priorityqueue_b14.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b20 + "' != '" + false+ "'", b20.equals(false));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    int i8 = priorityqueue_b6.size();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = priorityqueue_b6.comparator();
    boolean b11 = priorityqueue_b6.offer((java.lang.Boolean)false);
    java.lang.Boolean b12 = priorityqueue_b6.peek();
    priorityqueue_b6.clear();
    java.lang.Boolean b14 = priorityqueue_b6.poll();
    java.util.function.Consumer<java.lang.Object> consumer_obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    priorityqueue_b6.forEach(consumer_obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b12 + "' != '" + false+ "'", b12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b14);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b5.parallelStream();
    java.lang.Object[] obj_array7 = priorityqueue_b5.toArray();
    boolean b9 = priorityqueue_b5.offer((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b5);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { false };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b11, b_array13);
    java.util.Iterator<java.lang.Boolean> iterator_b15 = priorityqueue_b11.iterator();
    priorityqueue_b11.clear();
    java.lang.Boolean b17 = priorityqueue_b11.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array20 = new java.lang.Boolean[] { false };
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b18, b_array20);
    java.util.Iterator<java.lang.Boolean> iterator_b22 = priorityqueue_b18.iterator();
    priorityqueue_b18.clear();
    java.lang.Boolean b24 = priorityqueue_b18.poll();
    java.lang.Boolean b25 = priorityqueue_b18.peek();
    boolean b26 = priorityqueue_b11.remove((java.lang.Object)priorityqueue_b18);
    priorityqueue_b18.clear();
    boolean b28 = priorityqueue_b5.contains((java.lang.Object)priorityqueue_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.util.TreeSet<java.lang.Boolean> treeset_b6 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { true, true };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b6, b_array9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    boolean b12 = priorityqueue_b5.remove((java.lang.Object)treeset_b6);
    java.util.Iterator<java.lang.Boolean> iterator_b13 = priorityqueue_b5.iterator();
    priorityqueue_b5.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array18 = new java.lang.Boolean[] { false, false };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b15, b_array18);
    java.util.Iterator<java.lang.Boolean> iterator_b20 = priorityqueue_b15.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b21 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b15);
    java.lang.Boolean b22 = priorityqueue_b21.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b23 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array26 = new java.lang.Boolean[] { false, false };
    boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b23, b_array26);
    priorityqueue_b23.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b29 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array36 = priorityqueue_b29.toArray(str_array35);
    java.lang.String[] str_array37 = priorityqueue_b23.toArray(str_array36);
    boolean b38 = priorityqueue_b21.contains((java.lang.Object)priorityqueue_b23);
    java.lang.String[] str_array44 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array45 = priorityqueue_b23.toArray(str_array44);
    java.lang.String[] str_array46 = priorityqueue_b5.toArray(str_array45);
    java.lang.Object[] obj_array47 = priorityqueue_b5.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b48 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b22 + "' != '" + false+ "'", b22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'a', comparator_obj1);
    java.lang.Object[] obj_array3 = priorityqueue_b2.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = priorityqueue_b2.stream();
    java.lang.Object obj5 = null;
    boolean b6 = priorityqueue_b2.remove(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { false, false };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b8, b_array11);
    priorityqueue_b8.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array21 = priorityqueue_b14.toArray(str_array20);
    java.lang.String[] str_array22 = priorityqueue_b8.toArray(str_array21);
    boolean b23 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b8);
    java.lang.String[] str_array29 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array30 = priorityqueue_b8.toArray(str_array29);
    int i31 = priorityqueue_b8.size();
    java.lang.Boolean b32 = priorityqueue_b8.poll();
    java.util.ArrayList<java.lang.Boolean> arraylist_b33 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array35 = new java.lang.Boolean[] { true };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b33, b_array35);
    java.util.stream.Stream<java.lang.Boolean> stream_b37 = arraylist_b33.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b38 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b33);
    java.util.TreeSet<java.lang.Boolean> treeset_b39 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array42 = new java.lang.Boolean[] { true, true };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b39, b_array42);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b44 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b39);
    boolean b45 = priorityqueue_b38.remove((java.lang.Object)treeset_b39);
    java.util.Iterator<java.lang.Boolean> iterator_b46 = priorityqueue_b38.iterator();
    priorityqueue_b38.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b48 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array51 = new java.lang.Boolean[] { false, false };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b48, b_array51);
    java.util.Iterator<java.lang.Boolean> iterator_b53 = priorityqueue_b48.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b54 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b48);
    java.lang.Boolean b55 = priorityqueue_b54.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b56 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array59 = new java.lang.Boolean[] { false, false };
    boolean b60 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b56, b_array59);
    priorityqueue_b56.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b62 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array68 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array69 = priorityqueue_b62.toArray(str_array68);
    java.lang.String[] str_array70 = priorityqueue_b56.toArray(str_array69);
    boolean b71 = priorityqueue_b54.contains((java.lang.Object)priorityqueue_b56);
    java.lang.String[] str_array77 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array78 = priorityqueue_b56.toArray(str_array77);
    java.lang.String[] str_array79 = priorityqueue_b38.toArray(str_array78);
    java.lang.String[] str_array80 = priorityqueue_b8.toArray(str_array79);
    boolean b82 = priorityqueue_b8.add((java.lang.Boolean)true);
    java.util.function.Consumer<java.lang.Object> consumer_obj83 = null;
    // The following exception was thrown during execution in test generation
    try {
    priorityqueue_b8.forEach(consumer_obj83);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b55 + "' != '" + false+ "'", b55.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b3 = priorityqueue_b1.contains((java.lang.Object)"");
    java.util.Spliterator<java.lang.Boolean> spliterator_b4 = priorityqueue_b1.spliterator();
    java.util.stream.Stream<java.lang.Boolean> stream_b5 = priorityqueue_b1.stream();
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b1.parallelStream();
    java.util.TreeSet<java.lang.Boolean> treeset_b7 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array10 = new java.lang.Boolean[] { true, false };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b7, b_array10);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b7);
    boolean b13 = priorityqueue_b1.contains((java.lang.Object)priorityqueue_b12);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = priorityqueue_b12.comparator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b14);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    boolean b5 = priorityqueue_b0.add((java.lang.Boolean)false);
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b0.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    priorityqueue_b0.clear();
    java.lang.Object[] obj_array6 = priorityqueue_b0.toArray();
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    java.lang.Boolean b8 = priorityqueue_b0.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b8);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    java.lang.Boolean b6 = priorityqueue_b0.poll();
    boolean b8 = priorityqueue_b0.contains((java.lang.Object)100.0d);
    java.util.stream.Stream<java.lang.Boolean> stream_b9 = priorityqueue_b0.parallelStream();
    java.util.Iterator<java.lang.Boolean> iterator_b10 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b10);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    java.lang.Object[] obj_array6 = priorityqueue_b0.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b7 = priorityqueue_b0.stream();
    java.lang.Object[] obj_array8 = priorityqueue_b0.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b9 = priorityqueue_b0.stream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b9);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    boolean b8 = priorityqueue_b6.contains((java.lang.Object)(short)-1);
    java.util.ArrayList<java.lang.Boolean> arraylist_b9 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { true };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b9, b_array11);
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = arraylist_b9.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = arraylist_b9.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b9);
    boolean b16 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b15);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b15);
    boolean b19 = priorityqueue_b17.offer((java.lang.Boolean)false);
    java.lang.Boolean b20 = priorityqueue_b17.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b20 + "' != '" + false+ "'", b20.equals(false));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.Iterator<java.lang.Boolean> iterator_b6 = priorityqueue_b5.iterator();
    java.lang.Object[] obj_array7 = priorityqueue_b5.toArray();
    boolean b9 = priorityqueue_b5.offer((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'a', comparator_obj1);
    priorityqueue_b2.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array7 = new java.lang.Boolean[] { false, false };
    boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b4, b_array7);
    java.util.Iterator<java.lang.Boolean> iterator_b9 = priorityqueue_b4.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b4);
    java.util.Spliterator<java.lang.Boolean> spliterator_b11 = priorityqueue_b4.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b14 = priorityqueue_b4.remove((java.lang.Object)priorityqueue_b13);
    java.lang.Boolean b15 = priorityqueue_b13.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array19 = new java.lang.Boolean[] { false, false };
    boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b16, b_array19);
    java.util.Iterator<java.lang.Boolean> iterator_b21 = priorityqueue_b16.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b22 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b16);
    java.lang.Boolean b23 = priorityqueue_b22.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array27 = new java.lang.Boolean[] { false, false };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b24, b_array27);
    priorityqueue_b24.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array37 = priorityqueue_b30.toArray(str_array36);
    java.lang.String[] str_array38 = priorityqueue_b24.toArray(str_array37);
    boolean b39 = priorityqueue_b22.contains((java.lang.Object)priorityqueue_b24);
    java.lang.String[] str_array45 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array46 = priorityqueue_b24.toArray(str_array45);
    java.lang.String[] str_array47 = priorityqueue_b13.toArray(str_array45);
    java.lang.String[] str_array48 = priorityqueue_b2.toArray(str_array47);
    java.util.ArrayList<java.lang.Boolean> arraylist_b49 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array51 = new java.lang.Boolean[] { true };
    boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b49, b_array51);
    java.util.stream.Stream<java.lang.Boolean> stream_b53 = arraylist_b49.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b54 = arraylist_b49.spliterator();
    boolean b55 = priorityqueue_b2.contains((java.lang.Object)arraylist_b49);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b56 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b49);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b57 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b56);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b58 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array61 = new java.lang.Boolean[] { false, false };
    boolean b62 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b58, b_array61);
    java.util.Iterator<java.lang.Boolean> iterator_b63 = priorityqueue_b58.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b64 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b58);
    java.lang.Boolean b65 = priorityqueue_b64.peek();
    int i66 = priorityqueue_b64.size();
    java.util.Spliterator<java.lang.Boolean> spliterator_b67 = priorityqueue_b64.spliterator();
    boolean b68 = priorityqueue_b57.contains((java.lang.Object)priorityqueue_b64);
    java.lang.Boolean b69 = priorityqueue_b57.poll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b23 + "' != '" + false+ "'", b23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b65 + "' != '" + false+ "'", b65.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b69 + "' != '" + true+ "'", b69.equals(true));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    boolean b8 = priorityqueue_b6.offer((java.lang.Boolean)false);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = priorityqueue_b7.comparator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b8);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.stream.Stream<java.lang.Boolean> stream_b6 = priorityqueue_b5.parallelStream();
    int i7 = priorityqueue_b5.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    boolean b8 = priorityqueue_b6.offer((java.lang.Boolean)false);
    java.util.stream.Stream<java.lang.Boolean> stream_b9 = priorityqueue_b6.stream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array13 = new java.lang.Boolean[] { false, false };
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b10, b_array13);
    java.util.Iterator<java.lang.Boolean> iterator_b15 = priorityqueue_b10.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b10);
    java.util.Spliterator<java.lang.Boolean> spliterator_b17 = priorityqueue_b10.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b19 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b20 = priorityqueue_b10.remove((java.lang.Object)priorityqueue_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b21 = priorityqueue_b10.comparator();
    java.util.Comparator<java.lang.Boolean> comparator_b22 = priorityqueue_b10.comparator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b23 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b10);
    boolean b24 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.util.TreeSet<java.lang.Boolean> treeset_b6 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array9 = new java.lang.Boolean[] { true, true };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b6, b_array9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b6);
    boolean b12 = priorityqueue_b5.remove((java.lang.Object)treeset_b6);
    java.lang.Boolean b13 = priorityqueue_b5.poll();
    java.util.Spliterator<java.lang.Boolean> spliterator_b14 = priorityqueue_b5.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b13 + "' != '" + true+ "'", b13.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b14);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b2 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'a', comparator_obj1);
    java.util.Comparator<java.lang.Boolean> comparator_b3 = priorityqueue_b2.comparator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b2);
    java.lang.Boolean b5 = priorityqueue_b2.peek();
    boolean b7 = priorityqueue_b2.remove((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.lang.Boolean b7 = priorityqueue_b6.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    java.util.Spliterator<java.lang.Boolean> spliterator_b10 = priorityqueue_b9.spliterator();
    boolean b11 = priorityqueue_b6.remove((java.lang.Object)priorityqueue_b9);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b12 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { false, false };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b9, b_array12);
    java.util.Iterator<java.lang.Boolean> iterator_b14 = priorityqueue_b9.iterator();
    boolean b16 = priorityqueue_b9.add((java.lang.Boolean)false);
    priorityqueue_b9.clear();
    java.util.Iterator<java.lang.Boolean> iterator_b18 = priorityqueue_b9.iterator();
    java.lang.Boolean b19 = priorityqueue_b9.poll();
    java.util.Iterator<java.lang.Boolean> iterator_b20 = priorityqueue_b9.iterator();
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b23 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj22);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b23);
    boolean b25 = priorityqueue_b9.contains((java.lang.Object)priorityqueue_b23);
    boolean b26 = priorityqueue_b8.contains((java.lang.Object)priorityqueue_b9);
    java.lang.Boolean b27 = priorityqueue_b8.poll();
    priorityqueue_b8.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b27 + "' != '" + true+ "'", b27.equals(true));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    boolean b9 = priorityqueue_b0.offer((java.lang.Boolean)false);
    java.lang.Boolean b10 = priorityqueue_b0.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + false+ "'", b10.equals(false));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)treeset_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100, comparator_obj9);
    int i11 = priorityqueue_b10.size();
    boolean b12 = priorityqueue_b0.contains((java.lang.Object)priorityqueue_b10);
    int i13 = priorityqueue_b0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.util.Spliterator<java.lang.Boolean> spliterator_b7 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b10 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b9);
    java.util.Comparator<java.lang.Boolean> comparator_b11 = priorityqueue_b0.comparator();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = priorityqueue_b0.comparator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = priorityqueue_b0.comparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b14);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { false };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array2);
    java.util.Iterator<java.lang.Boolean> iterator_b4 = priorityqueue_b0.iterator();
    priorityqueue_b0.clear();
    boolean b7 = priorityqueue_b0.contains((java.lang.Object)1L);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = priorityqueue_b0.comparator();
    java.lang.Boolean b9 = priorityqueue_b0.poll();
    java.util.Comparator<java.lang.Boolean> comparator_b10 = priorityqueue_b0.comparator();
    priorityqueue_b0.clear();
    java.lang.Object[] obj_array12 = priorityqueue_b0.toArray();
    java.util.stream.Stream<java.lang.Boolean> stream_b13 = priorityqueue_b0.stream();
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b16 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj15);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b17 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b16);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b18 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array21 = new java.lang.Boolean[] { false, false };
    boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b18, b_array21);
    java.util.Iterator<java.lang.Boolean> iterator_b23 = priorityqueue_b18.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b18);
    java.util.Spliterator<java.lang.Boolean> spliterator_b25 = priorityqueue_b18.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b27 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)(byte)100);
    boolean b28 = priorityqueue_b18.remove((java.lang.Object)priorityqueue_b27);
    java.lang.Boolean b29 = priorityqueue_b27.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array33 = new java.lang.Boolean[] { false, false };
    boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b30, b_array33);
    java.util.Iterator<java.lang.Boolean> iterator_b35 = priorityqueue_b30.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b36 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b30);
    java.lang.Boolean b37 = priorityqueue_b36.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b38 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array41 = new java.lang.Boolean[] { false, false };
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b38, b_array41);
    priorityqueue_b38.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b44 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array51 = priorityqueue_b44.toArray(str_array50);
    java.lang.String[] str_array52 = priorityqueue_b38.toArray(str_array51);
    boolean b53 = priorityqueue_b36.contains((java.lang.Object)priorityqueue_b38);
    java.lang.String[] str_array59 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array60 = priorityqueue_b38.toArray(str_array59);
    java.lang.String[] str_array61 = priorityqueue_b27.toArray(str_array59);
    java.lang.String[] str_array62 = priorityqueue_b16.toArray(str_array61);
    java.lang.String[] str_array63 = priorityqueue_b0.toArray(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(comparator_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b37 + "' != '" + false+ "'", b37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b9 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array12 = new java.lang.Boolean[] { false, false };
    boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b9, b_array12);
    priorityqueue_b9.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array22 = priorityqueue_b15.toArray(str_array21);
    java.lang.String[] str_array23 = priorityqueue_b9.toArray(str_array22);
    boolean b24 = priorityqueue_b6.contains((java.lang.Object)str_array22);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b25 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b6);
    priorityqueue_b25.clear();
    java.util.ArrayList<java.lang.Boolean> arraylist_b27 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array29 = new java.lang.Boolean[] { true };
    boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b27, b_array29);
    java.util.stream.Stream<java.lang.Boolean> stream_b31 = arraylist_b27.parallelStream();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b32 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b27);
    java.util.TreeSet<java.lang.Boolean> treeset_b33 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array36 = new java.lang.Boolean[] { true, true };
    boolean b37 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b33, b_array36);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b38 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b33);
    boolean b39 = priorityqueue_b32.remove((java.lang.Object)treeset_b33);
    java.util.Iterator<java.lang.Boolean> iterator_b40 = priorityqueue_b32.iterator();
    priorityqueue_b32.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b42 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array45 = new java.lang.Boolean[] { false, false };
    boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b42, b_array45);
    java.util.Iterator<java.lang.Boolean> iterator_b47 = priorityqueue_b42.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b48 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b42);
    java.lang.Boolean b49 = priorityqueue_b48.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b50 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array53 = new java.lang.Boolean[] { false, false };
    boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b50, b_array53);
    priorityqueue_b50.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b56 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array63 = priorityqueue_b56.toArray(str_array62);
    java.lang.String[] str_array64 = priorityqueue_b50.toArray(str_array63);
    boolean b65 = priorityqueue_b48.contains((java.lang.Object)priorityqueue_b50);
    java.lang.String[] str_array71 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array72 = priorityqueue_b50.toArray(str_array71);
    java.lang.String[] str_array73 = priorityqueue_b32.toArray(str_array72);
    java.lang.Object[] obj_array74 = priorityqueue_b32.toArray();
    boolean b75 = priorityqueue_b25.remove((java.lang.Object)obj_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b49 + "' != '" + false+ "'", b49.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    priorityqueue_b0.clear();
    java.util.Spliterator<java.lang.Boolean> spliterator_b6 = priorityqueue_b0.spliterator();
    java.lang.Boolean b7 = priorityqueue_b0.poll();
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj9);
    boolean b12 = priorityqueue_b10.offer((java.lang.Boolean)true);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b10);
    priorityqueue_b10.clear();
    boolean b15 = priorityqueue_b0.remove((java.lang.Object)priorityqueue_b10);
    java.util.Spliterator<java.lang.Boolean> spliterator_b16 = priorityqueue_b0.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b16);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)'4');
    java.lang.Boolean b2 = priorityqueue_b1.poll();
    boolean b4 = priorityqueue_b1.offer((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    java.util.Iterator<java.lang.Boolean> iterator_b5 = priorityqueue_b0.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array11 = new java.lang.Boolean[] { false, false };
    boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b8, b_array11);
    priorityqueue_b8.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b14 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array21 = priorityqueue_b14.toArray(str_array20);
    java.lang.String[] str_array22 = priorityqueue_b8.toArray(str_array21);
    boolean b23 = priorityqueue_b6.contains((java.lang.Object)priorityqueue_b8);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b24 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array27 = new java.lang.Boolean[] { false, false };
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b24, b_array27);
    java.util.Iterator<java.lang.Boolean> iterator_b29 = priorityqueue_b24.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b30 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b24);
    java.lang.Boolean b31 = priorityqueue_b30.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b32 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array35 = new java.lang.Boolean[] { false, false };
    boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b32, b_array35);
    priorityqueue_b32.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b38 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array45 = priorityqueue_b38.toArray(str_array44);
    java.lang.String[] str_array46 = priorityqueue_b32.toArray(str_array45);
    boolean b47 = priorityqueue_b30.contains((java.lang.Object)priorityqueue_b32);
    java.lang.String[] str_array53 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array54 = priorityqueue_b32.toArray(str_array53);
    java.lang.String[] str_array55 = priorityqueue_b8.toArray(str_array53);
    java.util.Spliterator<java.lang.Boolean> spliterator_b56 = priorityqueue_b8.spliterator();
    java.util.Spliterator<java.lang.Boolean> spliterator_b57 = priorityqueue_b8.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + false+ "'", b7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b31 + "' != '" + false+ "'", b31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b57);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    int i5 = priorityqueue_b0.size();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b0);
    boolean b8 = priorityqueue_b6.offer((java.lang.Boolean)false);
    java.util.stream.Stream<java.lang.Boolean> stream_b9 = priorityqueue_b6.stream();
    boolean b11 = priorityqueue_b6.offer((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)' ');
    boolean b3 = priorityqueue_b1.add((java.lang.Boolean)false);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = priorityqueue_b1.parallelStream();
    java.lang.Object[] obj_array5 = priorityqueue_b1.toArray();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b1 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((int)' ');
    boolean b3 = priorityqueue_b1.add((java.lang.Boolean)false);
    java.lang.Object[] obj_array4 = priorityqueue_b1.toArray();
    boolean b6 = priorityqueue_b1.add((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array2);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b4 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.Iterator<java.lang.Boolean> iterator_b6 = priorityqueue_b5.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b5);
    java.util.function.Predicate<java.lang.Object> predicate_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = priorityqueue_b7.removeIf(predicate_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b6);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    java.util.ArrayList<java.lang.Boolean> arraylist_b0 = new java.util.ArrayList<java.lang.Boolean>();
    java.lang.Boolean[] b_array2 = new java.lang.Boolean[] { true };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)arraylist_b0, b_array2);
    java.util.stream.Stream<java.lang.Boolean> stream_b4 = arraylist_b0.parallelStream();
    java.util.Spliterator<java.lang.Boolean> spliterator_b5 = arraylist_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)arraylist_b0);
    java.lang.Boolean b7 = priorityqueue_b6.peek();
    java.lang.Boolean b8 = priorityqueue_b6.peek();
    java.lang.Object[] obj_array9 = priorityqueue_b6.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b10 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b6);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.Collection<java.lang.Boolean>)priorityqueue_b6);
    boolean b13 = priorityqueue_b6.add((java.lang.Boolean)true);
    int i14 = priorityqueue_b6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stream_b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b7 + "' != '" + true+ "'", b7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    java.util.TreeSet<java.lang.Boolean> treeset_b0 = new java.util.TreeSet<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { true, true };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)treeset_b0, b_array3);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b5 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b6 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b8 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>((java.util.SortedSet<java.lang.Boolean>)treeset_b0);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b11 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(100, comparator_obj10);
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "hi!" };
    java.lang.String[] str_array15 = priorityqueue_b11.toArray(str_array14);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String[] str_array16 = priorityqueue_b8.toArray(str_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException");
    } catch (java.lang.ArrayStoreException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayStoreException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b0 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array3 = new java.lang.Boolean[] { false, false };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b0, b_array3);
    priorityqueue_b0.clear();
    java.util.Spliterator<java.lang.Boolean> spliterator_b6 = priorityqueue_b0.spliterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b7 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array10 = new java.lang.Boolean[] { false, false };
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b7, b_array10);
    java.util.Iterator<java.lang.Boolean> iterator_b12 = priorityqueue_b7.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b13 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b7);
    java.lang.Boolean b14 = priorityqueue_b13.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b15 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array18 = new java.lang.Boolean[] { false, false };
    boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b15, b_array18);
    priorityqueue_b15.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b21 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array28 = priorityqueue_b21.toArray(str_array27);
    java.lang.String[] str_array29 = priorityqueue_b15.toArray(str_array28);
    boolean b30 = priorityqueue_b13.contains((java.lang.Object)priorityqueue_b15);
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b31 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array34 = new java.lang.Boolean[] { false, false };
    boolean b35 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b31, b_array34);
    java.util.Iterator<java.lang.Boolean> iterator_b36 = priorityqueue_b31.iterator();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b37 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>(priorityqueue_b31);
    java.lang.Boolean b38 = priorityqueue_b37.peek();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b39 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.Boolean[] b_array42 = new java.lang.Boolean[] { false, false };
    boolean b43 = java.util.Collections.addAll((java.util.Collection<java.lang.Boolean>)priorityqueue_b39, b_array42);
    priorityqueue_b39.clear();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b45 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array52 = priorityqueue_b45.toArray(str_array51);
    java.lang.String[] str_array53 = priorityqueue_b39.toArray(str_array52);
    boolean b54 = priorityqueue_b37.contains((java.lang.Object)priorityqueue_b39);
    java.lang.String[] str_array60 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
    java.lang.String[] str_array61 = priorityqueue_b39.toArray(str_array60);
    java.lang.String[] str_array62 = priorityqueue_b15.toArray(str_array60);
    java.lang.Boolean b63 = priorityqueue_b15.peek();
    java.lang.Boolean b64 = priorityqueue_b15.peek();
    java.lang.Object[] obj_array65 = priorityqueue_b15.toArray();
    br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean> priorityqueue_b66 = new br.ufal.ic.br.myjdk.PriorityQueue<java.lang.Boolean>();
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
    java.lang.String[] str_array73 = priorityqueue_b66.toArray(str_array72);
    java.lang.String[] str_array74 = priorityqueue_b15.toArray(str_array72);
    java.lang.String[] str_array75 = priorityqueue_b0.toArray(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(spliterator_b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator_b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b38 + "' != '" + false+ "'", b38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(b_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(b64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);

  }

}
