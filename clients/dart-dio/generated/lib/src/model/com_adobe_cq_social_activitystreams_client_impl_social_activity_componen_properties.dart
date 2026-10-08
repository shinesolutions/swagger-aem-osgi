//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties.g.dart';

/// ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties
///
/// Properties:
/// * [priority] 
@BuiltValue()
abstract class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties implements Built<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties, ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder> {
  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyInteger? get priority;

  ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties._();

  factory ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties([void updates(ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder b)]) = _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties> get serializer => _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesSerializer();
}

class _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties, _$ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties];

  @override
  final String wireName = r'ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priority.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder();
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

