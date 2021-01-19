x=gets.to_i
y=gets.to_i
if -1000<=x and x<=1000 and x!=0
  if -1000<=y and y<=1000 and y!=0
    if x>0
        if y>0
           puts "1"
        else
           puts "4"
        end
    else
        if y>0
           puts "2"
        else
           puts "3"
        end
    end
  end
end