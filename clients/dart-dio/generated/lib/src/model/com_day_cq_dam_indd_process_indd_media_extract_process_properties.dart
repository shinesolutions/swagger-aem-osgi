//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_indd_process_indd_media_extract_process_properties.g.dart';

/// ComDayCqDamInddProcessINDDMediaExtractProcessProperties
///
/// Properties:
/// * [processPeriodLabel] 
/// * [cqPeriodDamPeriodInddPeriodPagesPeriodRegex] 
/// * [idsPeriodJobPeriodDecoupled] 
/// * [idsPeriodJobPeriodWorkflowPeriodModel] 
@BuiltValue()
abstract class ComDayCqDamInddProcessINDDMediaExtractProcessProperties implements Built<ComDayCqDamInddProcessINDDMediaExtractProcessProperties, ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder> {
  @BuiltValueField(wireName: r'process.label')
  ConfigNodePropertyString? get processPeriodLabel;

  @BuiltValueField(wireName: r'cq.dam.indd.pages.regex')
  ConfigNodePropertyString? get cqPeriodDamPeriodInddPeriodPagesPeriodRegex;

  @BuiltValueField(wireName: r'ids.job.decoupled')
  ConfigNodePropertyBoolean? get idsPeriodJobPeriodDecoupled;

  @BuiltValueField(wireName: r'ids.job.workflow.model')
  ConfigNodePropertyString? get idsPeriodJobPeriodWorkflowPeriodModel;

  ComDayCqDamInddProcessINDDMediaExtractProcessProperties._();

  factory ComDayCqDamInddProcessINDDMediaExtractProcessProperties([void updates(ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder b)]) = _$ComDayCqDamInddProcessINDDMediaExtractProcessProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamInddProcessINDDMediaExtractProcessProperties> get serializer => _$ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesSerializer();
}

class _$ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamInddProcessINDDMediaExtractProcessProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamInddProcessINDDMediaExtractProcessProperties, _$ComDayCqDamInddProcessINDDMediaExtractProcessProperties];

  @override
  final String wireName = r'ComDayCqDamInddProcessINDDMediaExtractProcessProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamInddProcessINDDMediaExtractProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.processPeriodLabel != null) {
      yield r'process.label';
      yield serializers.serialize(
        object.processPeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodDamPeriodInddPeriodPagesPeriodRegex != null) {
      yield r'cq.dam.indd.pages.regex';
      yield serializers.serialize(
        object.cqPeriodDamPeriodInddPeriodPagesPeriodRegex,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.idsPeriodJobPeriodDecoupled != null) {
      yield r'ids.job.decoupled';
      yield serializers.serialize(
        object.idsPeriodJobPeriodDecoupled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.idsPeriodJobPeriodWorkflowPeriodModel != null) {
      yield r'ids.job.workflow.model';
      yield serializers.serialize(
        object.idsPeriodJobPeriodWorkflowPeriodModel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamInddProcessINDDMediaExtractProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'process.label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.processPeriodLabel.replace(valueDes);
          break;
        case r'cq.dam.indd.pages.regex':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodInddPeriodPagesPeriodRegex.replace(valueDes);
          break;
        case r'ids.job.decoupled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.idsPeriodJobPeriodDecoupled.replace(valueDes);
          break;
        case r'ids.job.workflow.model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.idsPeriodJobPeriodWorkflowPeriodModel.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamInddProcessINDDMediaExtractProcessProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamInddProcessINDDMediaExtractProcessPropertiesBuilder();
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

