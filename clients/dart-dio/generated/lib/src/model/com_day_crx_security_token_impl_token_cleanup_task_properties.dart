//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_crx_security_token_impl_token_cleanup_task_properties.g.dart';

/// ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
///
/// Properties:
/// * [enablePeriodTokenPeriodCleanupPeriodTask] 
/// * [schedulerPeriodExpression] 
/// * [batchPeriodSize] 
@BuiltValue()
abstract class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties implements Built<ComDayCrxSecurityTokenImplTokenCleanupTaskProperties, ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'enable.token.cleanup.task')
  ConfigNodePropertyBoolean? get enablePeriodTokenPeriodCleanupPeriodTask;

  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'batch.size')
  ConfigNodePropertyInteger? get batchPeriodSize;

  ComDayCrxSecurityTokenImplTokenCleanupTaskProperties._();

  factory ComDayCrxSecurityTokenImplTokenCleanupTaskProperties([void updates(ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder b)]) = _$ComDayCrxSecurityTokenImplTokenCleanupTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCrxSecurityTokenImplTokenCleanupTaskProperties> get serializer => _$ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesSerializer();
}

class _$ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesSerializer implements PrimitiveSerializer<ComDayCrxSecurityTokenImplTokenCleanupTaskProperties> {
  @override
  final Iterable<Type> types = const [ComDayCrxSecurityTokenImplTokenCleanupTaskProperties, _$ComDayCrxSecurityTokenImplTokenCleanupTaskProperties];

  @override
  final String wireName = r'ComDayCrxSecurityTokenImplTokenCleanupTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enablePeriodTokenPeriodCleanupPeriodTask != null) {
      yield r'enable.token.cleanup.task';
      yield serializers.serialize(
        object.enablePeriodTokenPeriodCleanupPeriodTask,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.batchPeriodSize != null) {
      yield r'batch.size';
      yield serializers.serialize(
        object.batchPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enable.token.cleanup.task':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodTokenPeriodCleanupPeriodTask.replace(valueDes);
          break;
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        case r'batch.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.batchPeriodSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCrxSecurityTokenImplTokenCleanupTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder();
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

