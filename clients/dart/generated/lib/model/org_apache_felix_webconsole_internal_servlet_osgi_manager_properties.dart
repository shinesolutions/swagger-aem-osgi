//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {
  /// Returns a new [OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties] instance.
  OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties({
    this.managerPeriodRoot,
    this.httpPeriodServicePeriodFilter,
    this.defaultPeriodRender,
    this.realm,
    this.username,
    this.password,
    this.category,
    this.locale,
    this.loglevel,
    this.plugins,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? managerPeriodRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? httpPeriodServicePeriodFilter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? defaultPeriodRender;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? realm;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? username;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? password;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? category;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? locale;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? loglevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? plugins;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties &&
    other.managerPeriodRoot == managerPeriodRoot &&
    other.httpPeriodServicePeriodFilter == httpPeriodServicePeriodFilter &&
    other.defaultPeriodRender == defaultPeriodRender &&
    other.realm == realm &&
    other.username == username &&
    other.password == password &&
    other.category == category &&
    other.locale == locale &&
    other.loglevel == loglevel &&
    other.plugins == plugins;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (managerPeriodRoot == null ? 0 : managerPeriodRoot!.hashCode) +
    (httpPeriodServicePeriodFilter == null ? 0 : httpPeriodServicePeriodFilter!.hashCode) +
    (defaultPeriodRender == null ? 0 : defaultPeriodRender!.hashCode) +
    (realm == null ? 0 : realm!.hashCode) +
    (username == null ? 0 : username!.hashCode) +
    (password == null ? 0 : password!.hashCode) +
    (category == null ? 0 : category!.hashCode) +
    (locale == null ? 0 : locale!.hashCode) +
    (loglevel == null ? 0 : loglevel!.hashCode) +
    (plugins == null ? 0 : plugins!.hashCode);

  @override
  String toString() => 'OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties[managerPeriodRoot=$managerPeriodRoot, httpPeriodServicePeriodFilter=$httpPeriodServicePeriodFilter, defaultPeriodRender=$defaultPeriodRender, realm=$realm, username=$username, password=$password, category=$category, locale=$locale, loglevel=$loglevel, plugins=$plugins]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.managerPeriodRoot != null) {
      json[r'manager.root'] = this.managerPeriodRoot;
    } else {
      json[r'manager.root'] = null;
    }
    if (this.httpPeriodServicePeriodFilter != null) {
      json[r'http.service.filter'] = this.httpPeriodServicePeriodFilter;
    } else {
      json[r'http.service.filter'] = null;
    }
    if (this.defaultPeriodRender != null) {
      json[r'default.render'] = this.defaultPeriodRender;
    } else {
      json[r'default.render'] = null;
    }
    if (this.realm != null) {
      json[r'realm'] = this.realm;
    } else {
      json[r'realm'] = null;
    }
    if (this.username != null) {
      json[r'username'] = this.username;
    } else {
      json[r'username'] = null;
    }
    if (this.password != null) {
      json[r'password'] = this.password;
    } else {
      json[r'password'] = null;
    }
    if (this.category != null) {
      json[r'category'] = this.category;
    } else {
      json[r'category'] = null;
    }
    if (this.locale != null) {
      json[r'locale'] = this.locale;
    } else {
      json[r'locale'] = null;
    }
    if (this.loglevel != null) {
      json[r'loglevel'] = this.loglevel;
    } else {
      json[r'loglevel'] = null;
    }
    if (this.plugins != null) {
      json[r'plugins'] = this.plugins;
    } else {
      json[r'plugins'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(
        managerPeriodRoot: ConfigNodePropertyString.fromJson(json[r'manager.root']),
        httpPeriodServicePeriodFilter: ConfigNodePropertyString.fromJson(json[r'http.service.filter']),
        defaultPeriodRender: ConfigNodePropertyString.fromJson(json[r'default.render']),
        realm: ConfigNodePropertyString.fromJson(json[r'realm']),
        username: ConfigNodePropertyString.fromJson(json[r'username']),
        password: ConfigNodePropertyString.fromJson(json[r'password']),
        category: ConfigNodePropertyString.fromJson(json[r'category']),
        locale: ConfigNodePropertyString.fromJson(json[r'locale']),
        loglevel: ConfigNodePropertyDropDown.fromJson(json[r'loglevel']),
        plugins: ConfigNodePropertyDropDown.fromJson(json[r'plugins']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

