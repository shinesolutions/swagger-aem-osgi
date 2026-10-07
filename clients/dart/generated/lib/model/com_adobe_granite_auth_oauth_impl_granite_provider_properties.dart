//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {
  /// Returns a new [ComAdobeGraniteAuthOauthImplGraniteProviderProperties] instance.
  ComAdobeGraniteAuthOauthImplGraniteProviderProperties({
    this.oauthPeriodProviderPeriodId,
    this.oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl,
    this.oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl,
    this.oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl,
    this.oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthOauthImplGraniteProviderProperties &&
    other.oauthPeriodProviderPeriodId == oauthPeriodProviderPeriodId &&
    other.oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl == oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl &&
    other.oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl == oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl &&
    other.oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl == oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl &&
    other.oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls == oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (oauthPeriodProviderPeriodId == null ? 0 : oauthPeriodProviderPeriodId!.hashCode) +
    (oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl == null ? 0 : oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl!.hashCode) +
    (oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl == null ? 0 : oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl!.hashCode) +
    (oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl == null ? 0 : oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl!.hashCode) +
    (oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls == null ? 0 : oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthOauthImplGraniteProviderProperties[oauthPeriodProviderPeriodId=$oauthPeriodProviderPeriodId, oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl=$oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl, oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl=$oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl, oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl=$oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl, oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls=$oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.oauthPeriodProviderPeriodId != null) {
      json[r'oauth.provider.id'] = this.oauthPeriodProviderPeriodId;
    } else {
      json[r'oauth.provider.id'] = null;
    }
    if (this.oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl != null) {
      json[r'oauth.provider.granite.authorization.url'] = this.oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl;
    } else {
      json[r'oauth.provider.granite.authorization.url'] = null;
    }
    if (this.oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl != null) {
      json[r'oauth.provider.granite.token.url'] = this.oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl;
    } else {
      json[r'oauth.provider.granite.token.url'] = null;
    }
    if (this.oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl != null) {
      json[r'oauth.provider.granite.profile.url'] = this.oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl;
    } else {
      json[r'oauth.provider.granite.profile.url'] = null;
    }
    if (this.oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls != null) {
      json[r'oauth.provider.granite.extended.details.urls'] = this.oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls;
    } else {
      json[r'oauth.provider.granite.extended.details.urls'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthOauthImplGraniteProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthOauthImplGraniteProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthOauthImplGraniteProviderProperties(
        oauthPeriodProviderPeriodId: ConfigNodePropertyString.fromJson(json[r'oauth.provider.id']),
        oauthPeriodProviderPeriodGranitePeriodAuthorizationPeriodUrl: ConfigNodePropertyString.fromJson(json[r'oauth.provider.granite.authorization.url']),
        oauthPeriodProviderPeriodGranitePeriodTokenPeriodUrl: ConfigNodePropertyString.fromJson(json[r'oauth.provider.granite.token.url']),
        oauthPeriodProviderPeriodGranitePeriodProfilePeriodUrl: ConfigNodePropertyString.fromJson(json[r'oauth.provider.granite.profile.url']),
        oauthPeriodProviderPeriodGranitePeriodExtendedPeriodDetailsPeriodUrls: ConfigNodePropertyString.fromJson(json[r'oauth.provider.granite.extended.details.urls']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthOauthImplGraniteProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthOauthImplGraniteProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthOauthImplGraniteProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthOauthImplGraniteProviderProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthOauthImplGraniteProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthOauthImplGraniteProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthOauthImplGraniteProviderProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthOauthImplGraniteProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthOauthImplGraniteProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthOauthImplGraniteProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

