//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties.g.dart';

/// ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties
///
/// Properties:
/// * [disableSmartSync] 
@BuiltValue()
abstract class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties implements Built<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'disableSmartSync')
  ConfigNodePropertyBoolean? get disableSmartSync;

  ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties._();

  factory ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties([void updates(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder b)]) = _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties> get serializer => _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesSerializer();
}

class _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties, _$ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.disableSmartSync != null) {
      yield r'disableSmartSync';
      yield serializers.serialize(
        object.disableSmartSync,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'disableSmartSync':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.disableSmartSync.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesBuilder();
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

