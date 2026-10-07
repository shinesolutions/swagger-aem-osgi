//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_transport_binary_less_transport_handler_properties.g.dart';

/// ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties
///
/// Properties:
/// * [disabledPeriodCipherPeriodSuites] 
/// * [enabledPeriodCipherPeriodSuites] 
@BuiltValue()
abstract class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties implements Built<ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties, ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'disabled.cipher.suites')
  ConfigNodePropertyArray? get disabledPeriodCipherPeriodSuites;

  @BuiltValueField(wireName: r'enabled.cipher.suites')
  ConfigNodePropertyArray? get enabledPeriodCipherPeriodSuites;

  ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties._();

  factory ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties([void updates(ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder b)]) = _$ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties> get serializer => _$ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesSerializer();
}

class _$ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties, _$ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.disabledPeriodCipherPeriodSuites != null) {
      yield r'disabled.cipher.suites';
      yield serializers.serialize(
        object.disabledPeriodCipherPeriodSuites,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.enabledPeriodCipherPeriodSuites != null) {
      yield r'enabled.cipher.suites';
      yield serializers.serialize(
        object.enabledPeriodCipherPeriodSuites,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'disabled.cipher.suites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.disabledPeriodCipherPeriodSuites.replace(valueDes);
          break;
        case r'enabled.cipher.suites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.enabledPeriodCipherPeriodSuites.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesBuilder();
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

