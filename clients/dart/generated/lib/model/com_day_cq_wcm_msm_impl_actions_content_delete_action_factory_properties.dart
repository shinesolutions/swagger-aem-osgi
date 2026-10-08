//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties {
  /// Returns a new [ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties] instance.
  ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties({
    this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes,
    this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems,
    this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties &&
    other.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes == cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes &&
    other.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems == cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems &&
    other.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops == cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes == null ? 0 : cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes!.hashCode) +
    (cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems == null ? 0 : cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems!.hashCode) +
    (cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops == null ? 0 : cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops!.hashCode);

  @override
  String toString() => 'ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties[cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes=$cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes, cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems=$cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems, cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops=$cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes != null) {
      json[r'cq.wcm.msm.action.excludednodetypes'] = this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes;
    } else {
      json[r'cq.wcm.msm.action.excludednodetypes'] = null;
    }
    if (this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems != null) {
      json[r'cq.wcm.msm.action.excludedparagraphitems'] = this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems;
    } else {
      json[r'cq.wcm.msm.action.excludedparagraphitems'] = null;
    }
    if (this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops != null) {
      json[r'cq.wcm.msm.action.excludedprops'] = this.cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops;
    } else {
      json[r'cq.wcm.msm.action.excludedprops'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties(
        cqPeriodWcmPeriodMsmPeriodActionPeriodExcludednodetypes: ConfigNodePropertyArray.fromJson(json[r'cq.wcm.msm.action.excludednodetypes']),
        cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedparagraphitems: ConfigNodePropertyArray.fromJson(json[r'cq.wcm.msm.action.excludedparagraphitems']),
        cqPeriodWcmPeriodMsmPeriodActionPeriodExcludedprops: ConfigNodePropertyArray.fromJson(json[r'cq.wcm.msm.action.excludedprops']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

