//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties.g.dart';

/// ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties
///
/// Properties:
/// * [flushAgents] 
@BuiltValue()
abstract class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties implements Built<ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties, ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'Flush agents')
  ConfigNodePropertyArray? get flushAgents;

  ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties._();

  factory ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties([void updates(ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder b)]) = _$ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties> get serializer => _$ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesSerializer();
}

class _$ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties, _$ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties];

  @override
  final String wireName = r'ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.flushAgents != null) {
      yield r'Flush agents';
      yield serializers.serialize(
        object.flushAgents,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'Flush agents':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.flushAgents.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesBuilder();
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

