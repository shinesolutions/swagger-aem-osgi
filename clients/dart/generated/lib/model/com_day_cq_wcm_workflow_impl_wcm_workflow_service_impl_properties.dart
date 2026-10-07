//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {
  /// Returns a new [ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties] instance.
  ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties({
    this.eventPeriodFilter,
    this.minThreadPoolSize,
    this.maxThreadPoolSize,
    this.cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate,
    this.cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? eventPeriodFilter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? minThreadPoolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxThreadPoolSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties &&
    other.eventPeriodFilter == eventPeriodFilter &&
    other.minThreadPoolSize == minThreadPoolSize &&
    other.maxThreadPoolSize == maxThreadPoolSize &&
    other.cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate == cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate &&
    other.cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList == cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventPeriodFilter == null ? 0 : eventPeriodFilter!.hashCode) +
    (minThreadPoolSize == null ? 0 : minThreadPoolSize!.hashCode) +
    (maxThreadPoolSize == null ? 0 : maxThreadPoolSize!.hashCode) +
    (cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate == null ? 0 : cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate!.hashCode) +
    (cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList == null ? 0 : cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList!.hashCode);

  @override
  String toString() => 'ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties[eventPeriodFilter=$eventPeriodFilter, minThreadPoolSize=$minThreadPoolSize, maxThreadPoolSize=$maxThreadPoolSize, cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate=$cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate, cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList=$cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventPeriodFilter != null) {
      json[r'event.filter'] = this.eventPeriodFilter;
    } else {
      json[r'event.filter'] = null;
    }
    if (this.minThreadPoolSize != null) {
      json[r'minThreadPoolSize'] = this.minThreadPoolSize;
    } else {
      json[r'minThreadPoolSize'] = null;
    }
    if (this.maxThreadPoolSize != null) {
      json[r'maxThreadPoolSize'] = this.maxThreadPoolSize;
    } else {
      json[r'maxThreadPoolSize'] = null;
    }
    if (this.cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate != null) {
      json[r'cq.wcm.workflow.terminate.on.activate'] = this.cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate;
    } else {
      json[r'cq.wcm.workflow.terminate.on.activate'] = null;
    }
    if (this.cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList != null) {
      json[r'cq.wcm.worklfow.terminate.exclusion.list'] = this.cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList;
    } else {
      json[r'cq.wcm.worklfow.terminate.exclusion.list'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(
        eventPeriodFilter: ConfigNodePropertyString.fromJson(json[r'event.filter']),
        minThreadPoolSize: ConfigNodePropertyInteger.fromJson(json[r'minThreadPoolSize']),
        maxThreadPoolSize: ConfigNodePropertyInteger.fromJson(json[r'maxThreadPoolSize']),
        cqPeriodWcmPeriodWorkflowPeriodTerminatePeriodOnPeriodActivate: ConfigNodePropertyBoolean.fromJson(json[r'cq.wcm.workflow.terminate.on.activate']),
        cqPeriodWcmPeriodWorklfowPeriodTerminatePeriodExclusionPeriodList: ConfigNodePropertyArray.fromJson(json[r'cq.wcm.worklfow.terminate.exclusion.list']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

