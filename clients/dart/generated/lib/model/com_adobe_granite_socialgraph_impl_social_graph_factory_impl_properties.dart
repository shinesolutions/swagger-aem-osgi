//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {
  /// Returns a new [ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties] instance.
  ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties({
    this.group2memberPeriodRelationshipPeriodOutgoing,
    this.group2memberPeriodExcludedPeriodOutgoing,
    this.group2memberPeriodRelationshipPeriodIncoming,
    this.group2memberPeriodExcludedPeriodIncoming,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? group2memberPeriodRelationshipPeriodOutgoing;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? group2memberPeriodExcludedPeriodOutgoing;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? group2memberPeriodRelationshipPeriodIncoming;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? group2memberPeriodExcludedPeriodIncoming;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties &&
    other.group2memberPeriodRelationshipPeriodOutgoing == group2memberPeriodRelationshipPeriodOutgoing &&
    other.group2memberPeriodExcludedPeriodOutgoing == group2memberPeriodExcludedPeriodOutgoing &&
    other.group2memberPeriodRelationshipPeriodIncoming == group2memberPeriodRelationshipPeriodIncoming &&
    other.group2memberPeriodExcludedPeriodIncoming == group2memberPeriodExcludedPeriodIncoming;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (group2memberPeriodRelationshipPeriodOutgoing == null ? 0 : group2memberPeriodRelationshipPeriodOutgoing!.hashCode) +
    (group2memberPeriodExcludedPeriodOutgoing == null ? 0 : group2memberPeriodExcludedPeriodOutgoing!.hashCode) +
    (group2memberPeriodRelationshipPeriodIncoming == null ? 0 : group2memberPeriodRelationshipPeriodIncoming!.hashCode) +
    (group2memberPeriodExcludedPeriodIncoming == null ? 0 : group2memberPeriodExcludedPeriodIncoming!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties[group2memberPeriodRelationshipPeriodOutgoing=$group2memberPeriodRelationshipPeriodOutgoing, group2memberPeriodExcludedPeriodOutgoing=$group2memberPeriodExcludedPeriodOutgoing, group2memberPeriodRelationshipPeriodIncoming=$group2memberPeriodRelationshipPeriodIncoming, group2memberPeriodExcludedPeriodIncoming=$group2memberPeriodExcludedPeriodIncoming]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.group2memberPeriodRelationshipPeriodOutgoing != null) {
      json[r'group2member.relationship.outgoing'] = this.group2memberPeriodRelationshipPeriodOutgoing;
    } else {
      json[r'group2member.relationship.outgoing'] = null;
    }
    if (this.group2memberPeriodExcludedPeriodOutgoing != null) {
      json[r'group2member.excluded.outgoing'] = this.group2memberPeriodExcludedPeriodOutgoing;
    } else {
      json[r'group2member.excluded.outgoing'] = null;
    }
    if (this.group2memberPeriodRelationshipPeriodIncoming != null) {
      json[r'group2member.relationship.incoming'] = this.group2memberPeriodRelationshipPeriodIncoming;
    } else {
      json[r'group2member.relationship.incoming'] = null;
    }
    if (this.group2memberPeriodExcludedPeriodIncoming != null) {
      json[r'group2member.excluded.incoming'] = this.group2memberPeriodExcludedPeriodIncoming;
    } else {
      json[r'group2member.excluded.incoming'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(
        group2memberPeriodRelationshipPeriodOutgoing: ConfigNodePropertyString.fromJson(json[r'group2member.relationship.outgoing']),
        group2memberPeriodExcludedPeriodOutgoing: ConfigNodePropertyArray.fromJson(json[r'group2member.excluded.outgoing']),
        group2memberPeriodRelationshipPeriodIncoming: ConfigNodePropertyString.fromJson(json[r'group2member.relationship.incoming']),
        group2memberPeriodExcludedPeriodIncoming: ConfigNodePropertyArray.fromJson(json[r'group2member.excluded.incoming']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

