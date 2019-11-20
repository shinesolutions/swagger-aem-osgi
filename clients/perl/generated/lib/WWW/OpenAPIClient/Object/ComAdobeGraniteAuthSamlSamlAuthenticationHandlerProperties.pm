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
package WWW::OpenAPIClient::Object::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties;

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
use WWW::OpenAPIClient::Object::ConfigNodePropertyDropDown;
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
                                  class => 'ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'path' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'path',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'service/ranking' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'service.ranking',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'idp_url' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'idpUrl',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'idp_cert_alias' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'idpCertAlias',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'idp_http_redirect' => {
    	datatype => 'ConfigNodePropertyBoolean',
    	base_name => 'idpHttpRedirect',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'service_provider_entity_id' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'serviceProviderEntityId',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'assertion_consumer_service_url' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'assertionConsumerServiceURL',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'sp_private_key_alias' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'spPrivateKeyAlias',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'key_store_password' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'keyStorePassword',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'default_redirect_url' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'defaultRedirectUrl',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'user_id_attribute' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'userIDAttribute',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'use_encryption' => {
    	datatype => 'ConfigNodePropertyBoolean',
    	base_name => 'useEncryption',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'create_user' => {
    	datatype => 'ConfigNodePropertyBoolean',
    	base_name => 'createUser',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'user_intermediate_path' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'userIntermediatePath',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'add_group_memberships' => {
    	datatype => 'ConfigNodePropertyBoolean',
    	base_name => 'addGroupMemberships',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'group_membership_attribute' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'groupMembershipAttribute',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'default_groups' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'defaultGroups',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'name_id_format' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'nameIdFormat',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'synchronize_attributes' => {
    	datatype => 'ConfigNodePropertyArray',
    	base_name => 'synchronizeAttributes',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'handle_logout' => {
    	datatype => 'ConfigNodePropertyBoolean',
    	base_name => 'handleLogout',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'logout_url' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'logoutUrl',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'clock_tolerance' => {
    	datatype => 'ConfigNodePropertyInteger',
    	base_name => 'clockTolerance',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'digest_method' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'digestMethod',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'signature_method' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'signatureMethod',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'identity_sync_type' => {
    	datatype => 'ConfigNodePropertyDropDown',
    	base_name => 'identitySyncType',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'idp_identifier' => {
    	datatype => 'ConfigNodePropertyString',
    	base_name => 'idpIdentifier',
    	description => '',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->openapi_types( {
    'path' => 'ConfigNodePropertyArray',
    'service/ranking' => 'ConfigNodePropertyInteger',
    'idp_url' => 'ConfigNodePropertyString',
    'idp_cert_alias' => 'ConfigNodePropertyString',
    'idp_http_redirect' => 'ConfigNodePropertyBoolean',
    'service_provider_entity_id' => 'ConfigNodePropertyString',
    'assertion_consumer_service_url' => 'ConfigNodePropertyString',
    'sp_private_key_alias' => 'ConfigNodePropertyString',
    'key_store_password' => 'ConfigNodePropertyString',
    'default_redirect_url' => 'ConfigNodePropertyString',
    'user_id_attribute' => 'ConfigNodePropertyString',
    'use_encryption' => 'ConfigNodePropertyBoolean',
    'create_user' => 'ConfigNodePropertyBoolean',
    'user_intermediate_path' => 'ConfigNodePropertyString',
    'add_group_memberships' => 'ConfigNodePropertyBoolean',
    'group_membership_attribute' => 'ConfigNodePropertyString',
    'default_groups' => 'ConfigNodePropertyArray',
    'name_id_format' => 'ConfigNodePropertyString',
    'synchronize_attributes' => 'ConfigNodePropertyArray',
    'handle_logout' => 'ConfigNodePropertyBoolean',
    'logout_url' => 'ConfigNodePropertyString',
    'clock_tolerance' => 'ConfigNodePropertyInteger',
    'digest_method' => 'ConfigNodePropertyString',
    'signature_method' => 'ConfigNodePropertyString',
    'identity_sync_type' => 'ConfigNodePropertyDropDown',
    'idp_identifier' => 'ConfigNodePropertyString'
} );

__PACKAGE__->attribute_map( {
    'path' => 'path',
    'service/ranking' => 'service.ranking',
    'idp_url' => 'idpUrl',
    'idp_cert_alias' => 'idpCertAlias',
    'idp_http_redirect' => 'idpHttpRedirect',
    'service_provider_entity_id' => 'serviceProviderEntityId',
    'assertion_consumer_service_url' => 'assertionConsumerServiceURL',
    'sp_private_key_alias' => 'spPrivateKeyAlias',
    'key_store_password' => 'keyStorePassword',
    'default_redirect_url' => 'defaultRedirectUrl',
    'user_id_attribute' => 'userIDAttribute',
    'use_encryption' => 'useEncryption',
    'create_user' => 'createUser',
    'user_intermediate_path' => 'userIntermediatePath',
    'add_group_memberships' => 'addGroupMemberships',
    'group_membership_attribute' => 'groupMembershipAttribute',
    'default_groups' => 'defaultGroups',
    'name_id_format' => 'nameIdFormat',
    'synchronize_attributes' => 'synchronizeAttributes',
    'handle_logout' => 'handleLogout',
    'logout_url' => 'logoutUrl',
    'clock_tolerance' => 'clockTolerance',
    'digest_method' => 'digestMethod',
    'signature_method' => 'signatureMethod',
    'identity_sync_type' => 'identitySyncType',
    'idp_identifier' => 'idpIdentifier'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;