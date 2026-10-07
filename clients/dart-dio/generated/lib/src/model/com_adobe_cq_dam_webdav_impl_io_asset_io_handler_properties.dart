//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_webdav_impl_io_asset_io_handler_properties.g.dart';

/// ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [pathPrefix] 
/// * [createVersion] 
@BuiltValue()
abstract class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties implements Built<ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties, ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'pathPrefix')
  ConfigNodePropertyString? get pathPrefix;

  @BuiltValueField(wireName: r'createVersion')
  ConfigNodePropertyBoolean? get createVersion;

  ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties._();

  factory ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties([void updates(ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder b)]) = _$ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties> get serializer => _$ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesSerializer();
}

class _$ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties, _$ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties];

  @override
  final String wireName = r'ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.pathPrefix != null) {
      yield r'pathPrefix';
      yield serializers.serialize(
        object.pathPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.createVersion != null) {
      yield r'createVersion';
      yield serializers.serialize(
        object.createVersion,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'pathPrefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pathPrefix.replace(valueDes);
          break;
        case r'createVersion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.createVersion.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder();
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

