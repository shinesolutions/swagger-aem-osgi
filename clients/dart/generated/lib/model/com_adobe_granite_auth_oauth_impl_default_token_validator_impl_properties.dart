//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {
  /// Returns a new [ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties] instance.
  ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties({
    this.authPeriodTokenPeriodValidatorPeriodType,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? authPeriodTokenPeriodValidatorPeriodType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties &&
    other.authPeriodTokenPeriodValidatorPeriodType == authPeriodTokenPeriodValidatorPeriodType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (authPeriodTokenPeriodValidatorPeriodType == null ? 0 : authPeriodTokenPeriodValidatorPeriodType!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties[authPeriodTokenPeriodValidatorPeriodType=$authPeriodTokenPeriodValidatorPeriodType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.authPeriodTokenPeriodValidatorPeriodType != null) {
      json[r'auth.token.validator.type'] = this.authPeriodTokenPeriodValidatorPeriodType;
    } else {
      json[r'auth.token.validator.type'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(
        authPeriodTokenPeriodValidatorPeriodType: ConfigNodePropertyString.fromJson(json[r'auth.token.validator.type']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

