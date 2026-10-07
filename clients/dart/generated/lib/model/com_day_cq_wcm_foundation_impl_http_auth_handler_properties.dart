//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
  /// Returns a new [ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] instance.
  ComDayCqWcmFoundationImplHTTPAuthHandlerProperties({
    this.path,
    this.authPeriodHttpPeriodNologin,
    this.authPeriodHttpPeriodRealm,
    this.authPeriodDefaultPeriodLoginpage,
    this.authPeriodCredPeriodForm,
    this.authPeriodCredPeriodUtf8,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? authPeriodHttpPeriodNologin;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? authPeriodHttpPeriodRealm;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? authPeriodDefaultPeriodLoginpage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? authPeriodCredPeriodForm;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? authPeriodCredPeriodUtf8;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmFoundationImplHTTPAuthHandlerProperties &&
    other.path == path &&
    other.authPeriodHttpPeriodNologin == authPeriodHttpPeriodNologin &&
    other.authPeriodHttpPeriodRealm == authPeriodHttpPeriodRealm &&
    other.authPeriodDefaultPeriodLoginpage == authPeriodDefaultPeriodLoginpage &&
    other.authPeriodCredPeriodForm == authPeriodCredPeriodForm &&
    other.authPeriodCredPeriodUtf8 == authPeriodCredPeriodUtf8;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (authPeriodHttpPeriodNologin == null ? 0 : authPeriodHttpPeriodNologin!.hashCode) +
    (authPeriodHttpPeriodRealm == null ? 0 : authPeriodHttpPeriodRealm!.hashCode) +
    (authPeriodDefaultPeriodLoginpage == null ? 0 : authPeriodDefaultPeriodLoginpage!.hashCode) +
    (authPeriodCredPeriodForm == null ? 0 : authPeriodCredPeriodForm!.hashCode) +
    (authPeriodCredPeriodUtf8 == null ? 0 : authPeriodCredPeriodUtf8!.hashCode);

  @override
  String toString() => 'ComDayCqWcmFoundationImplHTTPAuthHandlerProperties[path=$path, authPeriodHttpPeriodNologin=$authPeriodHttpPeriodNologin, authPeriodHttpPeriodRealm=$authPeriodHttpPeriodRealm, authPeriodDefaultPeriodLoginpage=$authPeriodDefaultPeriodLoginpage, authPeriodCredPeriodForm=$authPeriodCredPeriodForm, authPeriodCredPeriodUtf8=$authPeriodCredPeriodUtf8]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.authPeriodHttpPeriodNologin != null) {
      json[r'auth.http.nologin'] = this.authPeriodHttpPeriodNologin;
    } else {
      json[r'auth.http.nologin'] = null;
    }
    if (this.authPeriodHttpPeriodRealm != null) {
      json[r'auth.http.realm'] = this.authPeriodHttpPeriodRealm;
    } else {
      json[r'auth.http.realm'] = null;
    }
    if (this.authPeriodDefaultPeriodLoginpage != null) {
      json[r'auth.default.loginpage'] = this.authPeriodDefaultPeriodLoginpage;
    } else {
      json[r'auth.default.loginpage'] = null;
    }
    if (this.authPeriodCredPeriodForm != null) {
      json[r'auth.cred.form'] = this.authPeriodCredPeriodForm;
    } else {
      json[r'auth.cred.form'] = null;
    }
    if (this.authPeriodCredPeriodUtf8 != null) {
      json[r'auth.cred.utf8'] = this.authPeriodCredPeriodUtf8;
    } else {
      json[r'auth.cred.utf8'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmFoundationImplHTTPAuthHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        authPeriodHttpPeriodNologin: ConfigNodePropertyBoolean.fromJson(json[r'auth.http.nologin']),
        authPeriodHttpPeriodRealm: ConfigNodePropertyString.fromJson(json[r'auth.http.realm']),
        authPeriodDefaultPeriodLoginpage: ConfigNodePropertyString.fromJson(json[r'auth.default.loginpage']),
        authPeriodCredPeriodForm: ConfigNodePropertyArray.fromJson(json[r'auth.cred.form']),
        authPeriodCredPeriodUtf8: ConfigNodePropertyArray.fromJson(json[r'auth.cred.utf8']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmFoundationImplHTTPAuthHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmFoundationImplHTTPAuthHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmFoundationImplHTTPAuthHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmFoundationImplHTTPAuthHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmFoundationImplHTTPAuthHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmFoundationImplHTTPAuthHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmFoundationImplHTTPAuthHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmFoundationImplHTTPAuthHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

