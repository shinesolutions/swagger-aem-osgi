//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {
  /// Returns a new [ComAdobeGraniteAuthOauthImplGithubProviderImplProperties] instance.
  ComAdobeGraniteAuthOauthImplGithubProviderImplProperties({
    this.oauthPeriodProviderPeriodId,
    this.oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl,
    this.oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl,
    this.oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl,
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
  ConfigNodePropertyString? oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthOauthImplGithubProviderImplProperties &&
    other.oauthPeriodProviderPeriodId == oauthPeriodProviderPeriodId &&
    other.oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl == oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl &&
    other.oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl == oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl &&
    other.oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl == oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (oauthPeriodProviderPeriodId == null ? 0 : oauthPeriodProviderPeriodId!.hashCode) +
    (oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl == null ? 0 : oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl!.hashCode) +
    (oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl == null ? 0 : oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl!.hashCode) +
    (oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl == null ? 0 : oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthOauthImplGithubProviderImplProperties[oauthPeriodProviderPeriodId=$oauthPeriodProviderPeriodId, oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl=$oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl, oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl=$oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl, oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl=$oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.oauthPeriodProviderPeriodId != null) {
      json[r'oauth.provider.id'] = this.oauthPeriodProviderPeriodId;
    } else {
      json[r'oauth.provider.id'] = null;
    }
    if (this.oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl != null) {
      json[r'oauth.provider.github.authorization.url'] = this.oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl;
    } else {
      json[r'oauth.provider.github.authorization.url'] = null;
    }
    if (this.oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl != null) {
      json[r'oauth.provider.github.token.url'] = this.oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl;
    } else {
      json[r'oauth.provider.github.token.url'] = null;
    }
    if (this.oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl != null) {
      json[r'oauth.provider.github.profile.url'] = this.oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl;
    } else {
      json[r'oauth.provider.github.profile.url'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthOauthImplGithubProviderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthOauthImplGithubProviderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(
        oauthPeriodProviderPeriodId: ConfigNodePropertyString.fromJson(json[r'oauth.provider.id']),
        oauthPeriodProviderPeriodGithubPeriodAuthorizationPeriodUrl: ConfigNodePropertyString.fromJson(json[r'oauth.provider.github.authorization.url']),
        oauthPeriodProviderPeriodGithubPeriodTokenPeriodUrl: ConfigNodePropertyString.fromJson(json[r'oauth.provider.github.token.url']),
        oauthPeriodProviderPeriodGithubPeriodProfilePeriodUrl: ConfigNodePropertyString.fromJson(json[r'oauth.provider.github.profile.url']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthOauthImplGithubProviderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthOauthImplGithubProviderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthOauthImplGithubProviderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthOauthImplGithubProviderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthOauthImplGithubProviderImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthOauthImplGithubProviderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthOauthImplGithubProviderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

