//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties.g.dart';

/// ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
///
/// Properties:
/// * [portalPeriodOutboxes] 
/// * [draftPeriodDataPeriodService] 
/// * [draftPeriodMetadataPeriodService] 
/// * [submitPeriodDataPeriodService] 
/// * [submitPeriodMetadataPeriodService] 
/// * [pendingSignPeriodDataPeriodService] 
/// * [pendingSignPeriodMetadataPeriodService] 
@BuiltValue()
abstract class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties implements Built<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'portal.outboxes')
  ConfigNodePropertyArray? get portalPeriodOutboxes;

  @BuiltValueField(wireName: r'draft.data.service')
  ConfigNodePropertyString? get draftPeriodDataPeriodService;

  @BuiltValueField(wireName: r'draft.metadata.service')
  ConfigNodePropertyString? get draftPeriodMetadataPeriodService;

  @BuiltValueField(wireName: r'submit.data.service')
  ConfigNodePropertyString? get submitPeriodDataPeriodService;

  @BuiltValueField(wireName: r'submit.metadata.service')
  ConfigNodePropertyString? get submitPeriodMetadataPeriodService;

  @BuiltValueField(wireName: r'pendingSign.data.service')
  ConfigNodePropertyString? get pendingSignPeriodDataPeriodService;

  @BuiltValueField(wireName: r'pendingSign.metadata.service')
  ConfigNodePropertyString? get pendingSignPeriodMetadataPeriodService;

  ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties._();

  factory ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties([void updates(ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder b)]) = _$ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties> get serializer => _$ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesSerializer();
}

class _$ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesSerializer implements PrimitiveSerializer<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties, _$ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties];

  @override
  final String wireName = r'ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.portalPeriodOutboxes != null) {
      yield r'portal.outboxes';
      yield serializers.serialize(
        object.portalPeriodOutboxes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.draftPeriodDataPeriodService != null) {
      yield r'draft.data.service';
      yield serializers.serialize(
        object.draftPeriodDataPeriodService,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.draftPeriodMetadataPeriodService != null) {
      yield r'draft.metadata.service';
      yield serializers.serialize(
        object.draftPeriodMetadataPeriodService,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.submitPeriodDataPeriodService != null) {
      yield r'submit.data.service';
      yield serializers.serialize(
        object.submitPeriodDataPeriodService,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.submitPeriodMetadataPeriodService != null) {
      yield r'submit.metadata.service';
      yield serializers.serialize(
        object.submitPeriodMetadataPeriodService,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pendingSignPeriodDataPeriodService != null) {
      yield r'pendingSign.data.service';
      yield serializers.serialize(
        object.pendingSignPeriodDataPeriodService,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pendingSignPeriodMetadataPeriodService != null) {
      yield r'pendingSign.metadata.service';
      yield serializers.serialize(
        object.pendingSignPeriodMetadataPeriodService,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'portal.outboxes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.portalPeriodOutboxes.replace(valueDes);
          break;
        case r'draft.data.service':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.draftPeriodDataPeriodService.replace(valueDes);
          break;
        case r'draft.metadata.service':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.draftPeriodMetadataPeriodService.replace(valueDes);
          break;
        case r'submit.data.service':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.submitPeriodDataPeriodService.replace(valueDes);
          break;
        case r'submit.metadata.service':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.submitPeriodMetadataPeriodService.replace(valueDes);
          break;
        case r'pendingSign.data.service':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pendingSignPeriodDataPeriodService.replace(valueDes);
          break;
        case r'pendingSign.metadata.service':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pendingSignPeriodMetadataPeriodService.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

