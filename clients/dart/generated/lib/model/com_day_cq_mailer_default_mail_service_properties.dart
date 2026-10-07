//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqMailerDefaultMailServiceProperties {
  /// Returns a new [ComDayCqMailerDefaultMailServiceProperties] instance.
  ComDayCqMailerDefaultMailServiceProperties({
    this.smtpPeriodHost,
    this.smtpPeriodPort,
    this.smtpPeriodUser,
    this.smtpPeriodPassword,
    this.fromPeriodAddress,
    this.smtpPeriodSsl,
    this.smtpPeriodStarttls,
    this.debugPeriodEmail,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? smtpPeriodHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? smtpPeriodPort;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? smtpPeriodUser;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? smtpPeriodPassword;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? fromPeriodAddress;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? smtpPeriodSsl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? smtpPeriodStarttls;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? debugPeriodEmail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqMailerDefaultMailServiceProperties &&
    other.smtpPeriodHost == smtpPeriodHost &&
    other.smtpPeriodPort == smtpPeriodPort &&
    other.smtpPeriodUser == smtpPeriodUser &&
    other.smtpPeriodPassword == smtpPeriodPassword &&
    other.fromPeriodAddress == fromPeriodAddress &&
    other.smtpPeriodSsl == smtpPeriodSsl &&
    other.smtpPeriodStarttls == smtpPeriodStarttls &&
    other.debugPeriodEmail == debugPeriodEmail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (smtpPeriodHost == null ? 0 : smtpPeriodHost!.hashCode) +
    (smtpPeriodPort == null ? 0 : smtpPeriodPort!.hashCode) +
    (smtpPeriodUser == null ? 0 : smtpPeriodUser!.hashCode) +
    (smtpPeriodPassword == null ? 0 : smtpPeriodPassword!.hashCode) +
    (fromPeriodAddress == null ? 0 : fromPeriodAddress!.hashCode) +
    (smtpPeriodSsl == null ? 0 : smtpPeriodSsl!.hashCode) +
    (smtpPeriodStarttls == null ? 0 : smtpPeriodStarttls!.hashCode) +
    (debugPeriodEmail == null ? 0 : debugPeriodEmail!.hashCode);

  @override
  String toString() => 'ComDayCqMailerDefaultMailServiceProperties[smtpPeriodHost=$smtpPeriodHost, smtpPeriodPort=$smtpPeriodPort, smtpPeriodUser=$smtpPeriodUser, smtpPeriodPassword=$smtpPeriodPassword, fromPeriodAddress=$fromPeriodAddress, smtpPeriodSsl=$smtpPeriodSsl, smtpPeriodStarttls=$smtpPeriodStarttls, debugPeriodEmail=$debugPeriodEmail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.smtpPeriodHost != null) {
      json[r'smtp.host'] = this.smtpPeriodHost;
    } else {
      json[r'smtp.host'] = null;
    }
    if (this.smtpPeriodPort != null) {
      json[r'smtp.port'] = this.smtpPeriodPort;
    } else {
      json[r'smtp.port'] = null;
    }
    if (this.smtpPeriodUser != null) {
      json[r'smtp.user'] = this.smtpPeriodUser;
    } else {
      json[r'smtp.user'] = null;
    }
    if (this.smtpPeriodPassword != null) {
      json[r'smtp.password'] = this.smtpPeriodPassword;
    } else {
      json[r'smtp.password'] = null;
    }
    if (this.fromPeriodAddress != null) {
      json[r'from.address'] = this.fromPeriodAddress;
    } else {
      json[r'from.address'] = null;
    }
    if (this.smtpPeriodSsl != null) {
      json[r'smtp.ssl'] = this.smtpPeriodSsl;
    } else {
      json[r'smtp.ssl'] = null;
    }
    if (this.smtpPeriodStarttls != null) {
      json[r'smtp.starttls'] = this.smtpPeriodStarttls;
    } else {
      json[r'smtp.starttls'] = null;
    }
    if (this.debugPeriodEmail != null) {
      json[r'debug.email'] = this.debugPeriodEmail;
    } else {
      json[r'debug.email'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqMailerDefaultMailServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqMailerDefaultMailServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqMailerDefaultMailServiceProperties(
        smtpPeriodHost: ConfigNodePropertyString.fromJson(json[r'smtp.host']),
        smtpPeriodPort: ConfigNodePropertyInteger.fromJson(json[r'smtp.port']),
        smtpPeriodUser: ConfigNodePropertyString.fromJson(json[r'smtp.user']),
        smtpPeriodPassword: ConfigNodePropertyString.fromJson(json[r'smtp.password']),
        fromPeriodAddress: ConfigNodePropertyString.fromJson(json[r'from.address']),
        smtpPeriodSsl: ConfigNodePropertyBoolean.fromJson(json[r'smtp.ssl']),
        smtpPeriodStarttls: ConfigNodePropertyBoolean.fromJson(json[r'smtp.starttls']),
        debugPeriodEmail: ConfigNodePropertyBoolean.fromJson(json[r'debug.email']),
      );
    }
    return null;
  }

  static List<ComDayCqMailerDefaultMailServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqMailerDefaultMailServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqMailerDefaultMailServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqMailerDefaultMailServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqMailerDefaultMailServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqMailerDefaultMailServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqMailerDefaultMailServiceProperties-objects as value to a dart map
  static Map<String, List<ComDayCqMailerDefaultMailServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqMailerDefaultMailServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqMailerDefaultMailServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

