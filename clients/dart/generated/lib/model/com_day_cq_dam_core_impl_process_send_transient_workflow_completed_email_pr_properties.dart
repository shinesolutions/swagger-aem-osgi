//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {
  /// Returns a new [ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties] instance.
  ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties({
    this.processPeriodLabel,
    this.notifyOnComplete,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? processPeriodLabel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? notifyOnComplete;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties &&
    other.processPeriodLabel == processPeriodLabel &&
    other.notifyOnComplete == notifyOnComplete;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (processPeriodLabel == null ? 0 : processPeriodLabel!.hashCode) +
    (notifyOnComplete == null ? 0 : notifyOnComplete!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties[processPeriodLabel=$processPeriodLabel, notifyOnComplete=$notifyOnComplete]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.processPeriodLabel != null) {
      json[r'process.label'] = this.processPeriodLabel;
    } else {
      json[r'process.label'] = null;
    }
    if (this.notifyOnComplete != null) {
      json[r'Notify on Complete'] = this.notifyOnComplete;
    } else {
      json[r'Notify on Complete'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(
        processPeriodLabel: ConfigNodePropertyString.fromJson(json[r'process.label']),
        notifyOnComplete: ConfigNodePropertyBoolean.fromJson(json[r'Notify on Complete']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

