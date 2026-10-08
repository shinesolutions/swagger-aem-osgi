//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr_properties.g.dart';

/// ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties
///
/// Properties:
/// * [processPeriodLabel] 
/// * [notifyOnComplete] 
@BuiltValue()
abstract class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties implements Built<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties, ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder> {
  @BuiltValueField(wireName: r'process.label')
  ConfigNodePropertyString? get processPeriodLabel;

  @BuiltValueField(wireName: r'Notify on Complete')
  ConfigNodePropertyBoolean? get notifyOnComplete;

  ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties._();

  factory ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties([void updates(ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder b)]) = _$ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties> get serializer => _$ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesSerializer();
}

class _$ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties, _$ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.processPeriodLabel != null) {
      yield r'process.label';
      yield serializers.serialize(
        object.processPeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.notifyOnComplete != null) {
      yield r'Notify on Complete';
      yield serializers.serialize(
        object.notifyOnComplete,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder result,
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
        case r'Notify on Complete':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.notifyOnComplete.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesBuilder();
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

