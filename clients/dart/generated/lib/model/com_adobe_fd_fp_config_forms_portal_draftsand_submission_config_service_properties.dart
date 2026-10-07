//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
  /// Returns a new [ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties] instance.
  ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties({
    this.portalPeriodOutboxes,
    this.draftPeriodDataPeriodService,
    this.draftPeriodMetadataPeriodService,
    this.submitPeriodDataPeriodService,
    this.submitPeriodMetadataPeriodService,
    this.pendingSignPeriodDataPeriodService,
    this.pendingSignPeriodMetadataPeriodService,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? portalPeriodOutboxes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? draftPeriodDataPeriodService;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? draftPeriodMetadataPeriodService;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? submitPeriodDataPeriodService;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? submitPeriodMetadataPeriodService;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pendingSignPeriodDataPeriodService;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pendingSignPeriodMetadataPeriodService;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties &&
    other.portalPeriodOutboxes == portalPeriodOutboxes &&
    other.draftPeriodDataPeriodService == draftPeriodDataPeriodService &&
    other.draftPeriodMetadataPeriodService == draftPeriodMetadataPeriodService &&
    other.submitPeriodDataPeriodService == submitPeriodDataPeriodService &&
    other.submitPeriodMetadataPeriodService == submitPeriodMetadataPeriodService &&
    other.pendingSignPeriodDataPeriodService == pendingSignPeriodDataPeriodService &&
    other.pendingSignPeriodMetadataPeriodService == pendingSignPeriodMetadataPeriodService;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (portalPeriodOutboxes == null ? 0 : portalPeriodOutboxes!.hashCode) +
    (draftPeriodDataPeriodService == null ? 0 : draftPeriodDataPeriodService!.hashCode) +
    (draftPeriodMetadataPeriodService == null ? 0 : draftPeriodMetadataPeriodService!.hashCode) +
    (submitPeriodDataPeriodService == null ? 0 : submitPeriodDataPeriodService!.hashCode) +
    (submitPeriodMetadataPeriodService == null ? 0 : submitPeriodMetadataPeriodService!.hashCode) +
    (pendingSignPeriodDataPeriodService == null ? 0 : pendingSignPeriodDataPeriodService!.hashCode) +
    (pendingSignPeriodMetadataPeriodService == null ? 0 : pendingSignPeriodMetadataPeriodService!.hashCode);

  @override
  String toString() => 'ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties[portalPeriodOutboxes=$portalPeriodOutboxes, draftPeriodDataPeriodService=$draftPeriodDataPeriodService, draftPeriodMetadataPeriodService=$draftPeriodMetadataPeriodService, submitPeriodDataPeriodService=$submitPeriodDataPeriodService, submitPeriodMetadataPeriodService=$submitPeriodMetadataPeriodService, pendingSignPeriodDataPeriodService=$pendingSignPeriodDataPeriodService, pendingSignPeriodMetadataPeriodService=$pendingSignPeriodMetadataPeriodService]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.portalPeriodOutboxes != null) {
      json[r'portal.outboxes'] = this.portalPeriodOutboxes;
    } else {
      json[r'portal.outboxes'] = null;
    }
    if (this.draftPeriodDataPeriodService != null) {
      json[r'draft.data.service'] = this.draftPeriodDataPeriodService;
    } else {
      json[r'draft.data.service'] = null;
    }
    if (this.draftPeriodMetadataPeriodService != null) {
      json[r'draft.metadata.service'] = this.draftPeriodMetadataPeriodService;
    } else {
      json[r'draft.metadata.service'] = null;
    }
    if (this.submitPeriodDataPeriodService != null) {
      json[r'submit.data.service'] = this.submitPeriodDataPeriodService;
    } else {
      json[r'submit.data.service'] = null;
    }
    if (this.submitPeriodMetadataPeriodService != null) {
      json[r'submit.metadata.service'] = this.submitPeriodMetadataPeriodService;
    } else {
      json[r'submit.metadata.service'] = null;
    }
    if (this.pendingSignPeriodDataPeriodService != null) {
      json[r'pendingSign.data.service'] = this.pendingSignPeriodDataPeriodService;
    } else {
      json[r'pendingSign.data.service'] = null;
    }
    if (this.pendingSignPeriodMetadataPeriodService != null) {
      json[r'pendingSign.metadata.service'] = this.pendingSignPeriodMetadataPeriodService;
    } else {
      json[r'pendingSign.metadata.service'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(
        portalPeriodOutboxes: ConfigNodePropertyArray.fromJson(json[r'portal.outboxes']),
        draftPeriodDataPeriodService: ConfigNodePropertyString.fromJson(json[r'draft.data.service']),
        draftPeriodMetadataPeriodService: ConfigNodePropertyString.fromJson(json[r'draft.metadata.service']),
        submitPeriodDataPeriodService: ConfigNodePropertyString.fromJson(json[r'submit.data.service']),
        submitPeriodMetadataPeriodService: ConfigNodePropertyString.fromJson(json[r'submit.metadata.service']),
        pendingSignPeriodDataPeriodService: ConfigNodePropertyString.fromJson(json[r'pendingSign.data.service']),
        pendingSignPeriodMetadataPeriodService: ConfigNodePropertyString.fromJson(json[r'pendingSign.metadata.service']),
      );
    }
    return null;
  }

  static List<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties-objects as value to a dart map
  static Map<String, List<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

