//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties.g.dart';

/// ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties
///
/// Properties:
/// * [streamPath] 
/// * [streamName] 
@BuiltValue()
abstract class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties implements Built<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties, ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder> {
  @BuiltValueField(wireName: r'streamPath')
  ConfigNodePropertyString? get streamPath;

  @BuiltValueField(wireName: r'streamName')
  ConfigNodePropertyString? get streamName;

  ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties._();

  factory ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties([void updates(ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder b)]) = _$ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties> get serializer => _$ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesSerializer();
}

class _$ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties, _$ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties];

  @override
  final String wireName = r'ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.streamPath != null) {
      yield r'streamPath';
      yield serializers.serialize(
        object.streamPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.streamName != null) {
      yield r'streamName';
      yield serializers.serialize(
        object.streamName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'streamPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.streamPath.replace(valueDes);
          break;
        case r'streamName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.streamName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder();
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

