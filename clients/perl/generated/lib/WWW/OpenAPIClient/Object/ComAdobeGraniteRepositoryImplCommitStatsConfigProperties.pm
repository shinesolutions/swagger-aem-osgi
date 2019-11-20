=begin comment

Adobe Experience Manager OSGI config (AEM) API

Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API

OpenAPI spec version: 1.0.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::ComAdobeGraniteRepositoryImplCommitStatsConfigProperties;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::ConfigNodePropertyArray;
use WWW::OpenAPIClient::Object::ConfigNodePropertyBoolean;
use WWW::OpenAPIClient::Object::ConfigNodePropertyInteger;
use WWW::OpenAPIClient::Object::ConfigNodePropertyString;

use base ("Class::Accessor", "Class::Data::Inheritable");


#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

Adobe Experience Manager OSGI config (AEM) API

Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API

OpenAPI spec version: 1.0.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new object
sub new { 
    my ($class, %args) = @_; 

	my $self = bless {}, $class;
	
	foreach my $attribute (keys %{$class->attribute_map}) {
		my $args_key = $class->attribute_map->{$attribute};
		$self->$attribute( $args{ $args_key } );
	}
	
	return $self;
}  

# return perl hash
sub to_hash {
    return decode_json(JSON->new->convert_blessed->encode( shift ));
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }
    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
    	my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[/i) { # array
            my $_subclass = substr($_type, 6, -1);
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
        	$log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);
        
    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'ComAdobeGraniteRepositoryImplCommitStatsConfigProperties',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'enabled' => {
    	datatype => 'ConfigNodePropertyBoolean',
    	base_name => 'enabled',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'interval_seconds' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'intervalSeconds',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'commits_per_interval_threshold' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'commitsPerIntervalThreshold',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'max_location_length' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'maxLocationLength',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'max_details_shown' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'maxDetailsShown',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'min_details_percentage' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'minDetailsPercentage',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'thread_matchers' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'threadMatchers',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'max_greedy_depth' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'maxGreedyDepth',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'greedy_stack_matchers' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'greedyStackMatchers',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'stack_filters' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'stackFilters',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'stack_matchers' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'stackMatchers',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'stack_categorizers' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'stackCategorizers',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'stack_shorteners' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'stackShorteners',
    	description => '',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->openapi_types( {
    'enabled' => 'ConfigNodePropertyBoolean',
    'interval_seconds' => 'ConfigNodePropertyInteger',
    'commits_per_interval_threshold' => 'ConfigNodePropertyInteger',
    'max_location_length' => 'ConfigNodePropertyInteger',
    'max_details_shown' => 'ConfigNodePropertyInteger',
    'min_details_percentage' => 'ConfigNodePropertyInteger',
    'thread_matchers' => 'ConfigNodePropertyArray',
    'max_greedy_depth' => 'ConfigNodePropertyInteger',
    'greedy_stack_matchers' => 'ConfigNodePropertyString',
    'stack_filters' => 'ConfigNodePropertyArray',
    'stack_matchers' => 'ConfigNodePropertyArray',
    'stack_categorizers' => 'ConfigNodePropertyArray',
    'stack_shorteners' => 'ConfigNodePropertyArray'
} );

__PACKAGE__->attribute_map( {
    'enabled' => 'enabled',
    'interval_seconds' => 'intervalSeconds',
    'commits_per_interval_threshold' => 'commitsPerIntervalThreshold',
    'max_location_length' => 'maxLocationLength',
    'max_details_shown' => 'maxDetailsShown',
    'min_details_percentage' => 'minDetailsPercentage',
    'thread_matchers' => 'threadMatchers',
    'max_greedy_depth' => 'maxGreedyDepth',
    'greedy_stack_matchers' => 'greedyStackMatchers',
    'stack_filters' => 'stackFilters',
    'stack_matchers' => 'stackMatchers',
    'stack_categorizers' => 'stackCategorizers',
    'stack_shorteners' => 'stackShorteners'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;