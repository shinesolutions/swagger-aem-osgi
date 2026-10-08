//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_transport_http_properties.g.dart';

/// ComDayCqReplicationImplTransportHttpProperties
///
/// Properties:
/// * [disabledPeriodCipherPeriodSuites] 
/// * [enabledPeriodCipherPeriodSuites] 
@BuiltValue()
abstract class ComDayCqReplicationImplTransportHttpProperties implements Built<ComDayCqReplicationImplTransportHttpProperties, ComDayCqReplicationImplTransportHttpPropertiesBuilder> {
  @BuiltValueField(wireName: r'disabled.cipher.suites')
  ConfigNodePropertyArray? get disabledPeriodCipherPeriodSuites;

  @BuiltValueField(wireName: r'enabled.cipher.suites')
  ConfigNodePropertyArray? get enabledPeriodCipherPeriodSuites;

  ComDayCqReplicationImplTransportHttpProperties._();

  factory ComDayCqReplicationImplTransportHttpProperties([void updates(ComDayCqReplicationImplTransportHttpPropertiesBuilder b)]) = _$ComDayCqReplicationImplTransportHttpProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplTransportHttpPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplTransportHttpProperties> get serializer => _$ComDayCqReplicationImplTransportHttpPropertiesSerializer();
}

class _$ComDayCqReplicationImplTransportHttpPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplTransportHttpProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplTransportHttpProperties, _$ComDayCqReplicationImplTransportHttpProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplTransportHttpProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplTransportHttpProperties object, {
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
    ComDayCqReplicationImplTransportHttpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplTransportHttpPropertiesBuilder result,
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
  ComDayCqReplicationImplTransportHttpProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplTransportHttpPropertiesBuilder();
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

