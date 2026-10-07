//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties.g.dart';

/// ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
///
/// Properties:
/// * [tcpPort] 
/// * [allowRemoteAccess] 
/// * [maxRenderRgnPixels] 
/// * [maxMessageSize] 
/// * [randomAccessUrlTimeout] 
/// * [workerThreads] 
@BuiltValue()
abstract class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties implements Built<ComAdobeCqDamS7imagingImplIsImageServerComponentProperties, ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder> {
  @BuiltValueField(wireName: r'TcpPort')
  ConfigNodePropertyString? get tcpPort;

  @BuiltValueField(wireName: r'AllowRemoteAccess')
  ConfigNodePropertyBoolean? get allowRemoteAccess;

  @BuiltValueField(wireName: r'MaxRenderRgnPixels')
  ConfigNodePropertyString? get maxRenderRgnPixels;

  @BuiltValueField(wireName: r'MaxMessageSize')
  ConfigNodePropertyString? get maxMessageSize;

  @BuiltValueField(wireName: r'RandomAccessUrlTimeout')
  ConfigNodePropertyInteger? get randomAccessUrlTimeout;

  @BuiltValueField(wireName: r'WorkerThreads')
  ConfigNodePropertyInteger? get workerThreads;

  ComAdobeCqDamS7imagingImplIsImageServerComponentProperties._();

  factory ComAdobeCqDamS7imagingImplIsImageServerComponentProperties([void updates(ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder b)]) = _$ComAdobeCqDamS7imagingImplIsImageServerComponentProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamS7imagingImplIsImageServerComponentProperties> get serializer => _$ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesSerializer();
}

class _$ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamS7imagingImplIsImageServerComponentProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamS7imagingImplIsImageServerComponentProperties, _$ComAdobeCqDamS7imagingImplIsImageServerComponentProperties];

  @override
  final String wireName = r'ComAdobeCqDamS7imagingImplIsImageServerComponentProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.tcpPort != null) {
      yield r'TcpPort';
      yield serializers.serialize(
        object.tcpPort,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.allowRemoteAccess != null) {
      yield r'AllowRemoteAccess';
      yield serializers.serialize(
        object.allowRemoteAccess,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.maxRenderRgnPixels != null) {
      yield r'MaxRenderRgnPixels';
      yield serializers.serialize(
        object.maxRenderRgnPixels,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxMessageSize != null) {
      yield r'MaxMessageSize';
      yield serializers.serialize(
        object.maxMessageSize,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.randomAccessUrlTimeout != null) {
      yield r'RandomAccessUrlTimeout';
      yield serializers.serialize(
        object.randomAccessUrlTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.workerThreads != null) {
      yield r'WorkerThreads';
      yield serializers.serialize(
        object.workerThreads,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'TcpPort':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tcpPort.replace(valueDes);
          break;
        case r'AllowRemoteAccess':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.allowRemoteAccess.replace(valueDes);
          break;
        case r'MaxRenderRgnPixels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.maxRenderRgnPixels.replace(valueDes);
          break;
        case r'MaxMessageSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.maxMessageSize.replace(valueDes);
          break;
        case r'RandomAccessUrlTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.randomAccessUrlTimeout.replace(valueDes);
          break;
        case r'WorkerThreads':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.workerThreads.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamS7imagingImplIsImageServerComponentProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamS7imagingImplIsImageServerComponentPropertiesBuilder();
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

