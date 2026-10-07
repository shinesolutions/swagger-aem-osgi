//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqAccountApiAccountManagementServiceProperties {
  /// Returns a new [ComAdobeCqAccountApiAccountManagementServiceProperties] instance.
  ComAdobeCqAccountApiAccountManagementServiceProperties({
    this.cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod,
    this.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail,
    this.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqAccountApiAccountManagementServiceProperties &&
    other.cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod == cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod &&
    other.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail == cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail &&
    other.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail == cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod == null ? 0 : cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod!.hashCode) +
    (cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail == null ? 0 : cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail!.hashCode) +
    (cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail == null ? 0 : cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail!.hashCode);

  @override
  String toString() => 'ComAdobeCqAccountApiAccountManagementServiceProperties[cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod=$cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod, cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail=$cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail, cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail=$cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod != null) {
      json[r'cq.accountmanager.token.validity.period'] = this.cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod;
    } else {
      json[r'cq.accountmanager.token.validity.period'] = null;
    }
    if (this.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail != null) {
      json[r'cq.accountmanager.config.requestnewaccount.mail'] = this.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail;
    } else {
      json[r'cq.accountmanager.config.requestnewaccount.mail'] = null;
    }
    if (this.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail != null) {
      json[r'cq.accountmanager.config.requestnewpwd.mail'] = this.cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail;
    } else {
      json[r'cq.accountmanager.config.requestnewpwd.mail'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqAccountApiAccountManagementServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqAccountApiAccountManagementServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqAccountApiAccountManagementServiceProperties(
        cqPeriodAccountmanagerPeriodTokenPeriodValidityPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'cq.accountmanager.token.validity.period']),
        cqPeriodAccountmanagerPeriodConfigPeriodRequestnewaccountPeriodMail: ConfigNodePropertyString.fromJson(json[r'cq.accountmanager.config.requestnewaccount.mail']),
        cqPeriodAccountmanagerPeriodConfigPeriodRequestnewpwdPeriodMail: ConfigNodePropertyString.fromJson(json[r'cq.accountmanager.config.requestnewpwd.mail']),
      );
    }
    return null;
  }

  static List<ComAdobeCqAccountApiAccountManagementServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqAccountApiAccountManagementServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqAccountApiAccountManagementServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqAccountApiAccountManagementServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqAccountApiAccountManagementServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqAccountApiAccountManagementServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqAccountApiAccountManagementServiceProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqAccountApiAccountManagementServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqAccountApiAccountManagementServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqAccountApiAccountManagementServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

