//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {
  /// Returns a new [ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties] instance.
  ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties({
    this.facebook,
    this.twitter,
    this.providerPeriodConfigPeriodUserPeriodFolder,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? facebook;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? twitter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? providerPeriodConfigPeriodUserPeriodFolder;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties &&
    other.facebook == facebook &&
    other.twitter == twitter &&
    other.providerPeriodConfigPeriodUserPeriodFolder == providerPeriodConfigPeriodUserPeriodFolder;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (facebook == null ? 0 : facebook!.hashCode) +
    (twitter == null ? 0 : twitter!.hashCode) +
    (providerPeriodConfigPeriodUserPeriodFolder == null ? 0 : providerPeriodConfigPeriodUserPeriodFolder!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties[facebook=$facebook, twitter=$twitter, providerPeriodConfigPeriodUserPeriodFolder=$providerPeriodConfigPeriodUserPeriodFolder]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.facebook != null) {
      json[r'facebook'] = this.facebook;
    } else {
      json[r'facebook'] = null;
    }
    if (this.twitter != null) {
      json[r'twitter'] = this.twitter;
    } else {
      json[r'twitter'] = null;
    }
    if (this.providerPeriodConfigPeriodUserPeriodFolder != null) {
      json[r'provider.config.user.folder'] = this.providerPeriodConfigPeriodUserPeriodFolder;
    } else {
      json[r'provider.config.user.folder'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(
        facebook: ConfigNodePropertyArray.fromJson(json[r'facebook']),
        twitter: ConfigNodePropertyArray.fromJson(json[r'twitter']),
        providerPeriodConfigPeriodUserPeriodFolder: ConfigNodePropertyString.fromJson(json[r'provider.config.user.folder']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

