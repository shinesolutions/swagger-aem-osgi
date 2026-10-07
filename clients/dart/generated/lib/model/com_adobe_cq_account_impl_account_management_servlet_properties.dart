//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqAccountImplAccountManagementServletProperties {
  /// Returns a new [ComAdobeCqAccountImplAccountManagementServletProperties] instance.
  ComAdobeCqAccountImplAccountManagementServletProperties({
    this.cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail,
    this.cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqAccountImplAccountManagementServletProperties &&
    other.cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail == cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail &&
    other.cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail == cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail == null ? 0 : cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail!.hashCode) +
    (cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail == null ? 0 : cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail!.hashCode);

  @override
  String toString() => 'ComAdobeCqAccountImplAccountManagementServletProperties[cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail=$cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail, cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail=$cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail != null) {
      json[r'cq.accountmanager.config.informnewaccount.mail'] = this.cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail;
    } else {
      json[r'cq.accountmanager.config.informnewaccount.mail'] = null;
    }
    if (this.cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail != null) {
      json[r'cq.accountmanager.config.informnewpwd.mail'] = this.cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail;
    } else {
      json[r'cq.accountmanager.config.informnewpwd.mail'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqAccountImplAccountManagementServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqAccountImplAccountManagementServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqAccountImplAccountManagementServletProperties(
        cqPeriodAccountmanagerPeriodConfigPeriodInformnewaccountPeriodMail: ConfigNodePropertyString.fromJson(json[r'cq.accountmanager.config.informnewaccount.mail']),
        cqPeriodAccountmanagerPeriodConfigPeriodInformnewpwdPeriodMail: ConfigNodePropertyString.fromJson(json[r'cq.accountmanager.config.informnewpwd.mail']),
      );
    }
    return null;
  }

  static List<ComAdobeCqAccountImplAccountManagementServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqAccountImplAccountManagementServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqAccountImplAccountManagementServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqAccountImplAccountManagementServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqAccountImplAccountManagementServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqAccountImplAccountManagementServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqAccountImplAccountManagementServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqAccountImplAccountManagementServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqAccountImplAccountManagementServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqAccountImplAccountManagementServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

