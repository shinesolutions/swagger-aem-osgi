//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamInddProcessINDDMediaExtractProcessProperties {
  /// Returns a new [ComDayCqDamInddProcessINDDMediaExtractProcessProperties] instance.
  ComDayCqDamInddProcessINDDMediaExtractProcessProperties({
    this.processPeriodLabel,
    this.cqPeriodDamPeriodInddPeriodPagesPeriodRegex,
    this.idsPeriodJobPeriodDecoupled,
    this.idsPeriodJobPeriodWorkflowPeriodModel,
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
  ConfigNodePropertyString? cqPeriodDamPeriodInddPeriodPagesPeriodRegex;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? idsPeriodJobPeriodDecoupled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? idsPeriodJobPeriodWorkflowPeriodModel;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamInddProcessINDDMediaExtractProcessProperties &&
    other.processPeriodLabel == processPeriodLabel &&
    other.cqPeriodDamPeriodInddPeriodPagesPeriodRegex == cqPeriodDamPeriodInddPeriodPagesPeriodRegex &&
    other.idsPeriodJobPeriodDecoupled == idsPeriodJobPeriodDecoupled &&
    other.idsPeriodJobPeriodWorkflowPeriodModel == idsPeriodJobPeriodWorkflowPeriodModel;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (processPeriodLabel == null ? 0 : processPeriodLabel!.hashCode) +
    (cqPeriodDamPeriodInddPeriodPagesPeriodRegex == null ? 0 : cqPeriodDamPeriodInddPeriodPagesPeriodRegex!.hashCode) +
    (idsPeriodJobPeriodDecoupled == null ? 0 : idsPeriodJobPeriodDecoupled!.hashCode) +
    (idsPeriodJobPeriodWorkflowPeriodModel == null ? 0 : idsPeriodJobPeriodWorkflowPeriodModel!.hashCode);

  @override
  String toString() => 'ComDayCqDamInddProcessINDDMediaExtractProcessProperties[processPeriodLabel=$processPeriodLabel, cqPeriodDamPeriodInddPeriodPagesPeriodRegex=$cqPeriodDamPeriodInddPeriodPagesPeriodRegex, idsPeriodJobPeriodDecoupled=$idsPeriodJobPeriodDecoupled, idsPeriodJobPeriodWorkflowPeriodModel=$idsPeriodJobPeriodWorkflowPeriodModel]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.processPeriodLabel != null) {
      json[r'process.label'] = this.processPeriodLabel;
    } else {
      json[r'process.label'] = null;
    }
    if (this.cqPeriodDamPeriodInddPeriodPagesPeriodRegex != null) {
      json[r'cq.dam.indd.pages.regex'] = this.cqPeriodDamPeriodInddPeriodPagesPeriodRegex;
    } else {
      json[r'cq.dam.indd.pages.regex'] = null;
    }
    if (this.idsPeriodJobPeriodDecoupled != null) {
      json[r'ids.job.decoupled'] = this.idsPeriodJobPeriodDecoupled;
    } else {
      json[r'ids.job.decoupled'] = null;
    }
    if (this.idsPeriodJobPeriodWorkflowPeriodModel != null) {
      json[r'ids.job.workflow.model'] = this.idsPeriodJobPeriodWorkflowPeriodModel;
    } else {
      json[r'ids.job.workflow.model'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamInddProcessINDDMediaExtractProcessProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamInddProcessINDDMediaExtractProcessProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamInddProcessINDDMediaExtractProcessProperties(
        processPeriodLabel: ConfigNodePropertyString.fromJson(json[r'process.label']),
        cqPeriodDamPeriodInddPeriodPagesPeriodRegex: ConfigNodePropertyString.fromJson(json[r'cq.dam.indd.pages.regex']),
        idsPeriodJobPeriodDecoupled: ConfigNodePropertyBoolean.fromJson(json[r'ids.job.decoupled']),
        idsPeriodJobPeriodWorkflowPeriodModel: ConfigNodePropertyString.fromJson(json[r'ids.job.workflow.model']),
      );
    }
    return null;
  }

  static List<ComDayCqDamInddProcessINDDMediaExtractProcessProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamInddProcessINDDMediaExtractProcessProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamInddProcessINDDMediaExtractProcessProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamInddProcessINDDMediaExtractProcessProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamInddProcessINDDMediaExtractProcessProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamInddProcessINDDMediaExtractProcessProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamInddProcessINDDMediaExtractProcessProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamInddProcessINDDMediaExtractProcessProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamInddProcessINDDMediaExtractProcessProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamInddProcessINDDMediaExtractProcessProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

