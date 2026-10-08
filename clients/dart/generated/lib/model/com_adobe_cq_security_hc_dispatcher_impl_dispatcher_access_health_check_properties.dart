//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {
  /// Returns a new [ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties] instance.
  ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties({
    this.hcPeriodTags,
    this.dispatcherPeriodAddress,
    this.dispatcherPeriodFilterPeriodAllowed,
    this.dispatcherPeriodFilterPeriodBlocked,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? hcPeriodTags;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? dispatcherPeriodAddress;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? dispatcherPeriodFilterPeriodAllowed;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? dispatcherPeriodFilterPeriodBlocked;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties &&
    other.hcPeriodTags == hcPeriodTags &&
    other.dispatcherPeriodAddress == dispatcherPeriodAddress &&
    other.dispatcherPeriodFilterPeriodAllowed == dispatcherPeriodFilterPeriodAllowed &&
    other.dispatcherPeriodFilterPeriodBlocked == dispatcherPeriodFilterPeriodBlocked;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode) +
    (dispatcherPeriodAddress == null ? 0 : dispatcherPeriodAddress!.hashCode) +
    (dispatcherPeriodFilterPeriodAllowed == null ? 0 : dispatcherPeriodFilterPeriodAllowed!.hashCode) +
    (dispatcherPeriodFilterPeriodBlocked == null ? 0 : dispatcherPeriodFilterPeriodBlocked!.hashCode);

  @override
  String toString() => 'ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties[hcPeriodTags=$hcPeriodTags, dispatcherPeriodAddress=$dispatcherPeriodAddress, dispatcherPeriodFilterPeriodAllowed=$dispatcherPeriodFilterPeriodAllowed, dispatcherPeriodFilterPeriodBlocked=$dispatcherPeriodFilterPeriodBlocked]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    if (this.dispatcherPeriodAddress != null) {
      json[r'dispatcher.address'] = this.dispatcherPeriodAddress;
    } else {
      json[r'dispatcher.address'] = null;
    }
    if (this.dispatcherPeriodFilterPeriodAllowed != null) {
      json[r'dispatcher.filter.allowed'] = this.dispatcherPeriodFilterPeriodAllowed;
    } else {
      json[r'dispatcher.filter.allowed'] = null;
    }
    if (this.dispatcherPeriodFilterPeriodBlocked != null) {
      json[r'dispatcher.filter.blocked'] = this.dispatcherPeriodFilterPeriodBlocked;
    } else {
      json[r'dispatcher.filter.blocked'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
        dispatcherPeriodAddress: ConfigNodePropertyString.fromJson(json[r'dispatcher.address']),
        dispatcherPeriodFilterPeriodAllowed: ConfigNodePropertyArray.fromJson(json[r'dispatcher.filter.allowed']),
        dispatcherPeriodFilterPeriodBlocked: ConfigNodePropertyArray.fromJson(json[r'dispatcher.filter.blocked']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

