//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties.g.dart';

/// ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties
///
/// Properties:
/// * [comPeriodDayPeriodCqPeriodDamPeriodCorePeriodImplPeriodIoPeriodSpecialFilesHandlerPeriodFilepatters] 
@BuiltValue()
abstract class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties implements Built<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties, ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters')
  ConfigNodePropertyArray? get comPeriodDayPeriodCqPeriodDamPeriodCorePeriodImplPeriodIoPeriodSpecialFilesHandlerPeriodFilepatters;

  ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties._();

  factory ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties([void updates(ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder b)]) = _$ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties> get serializer => _$ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesSerializer();
}

class _$ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties, _$ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties];

  @override
  final String wireName = r'ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodDayPeriodCqPeriodDamPeriodCorePeriodImplPeriodIoPeriodSpecialFilesHandlerPeriodFilepatters != null) {
      yield r'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters';
      yield serializers.serialize(
        object.comPeriodDayPeriodCqPeriodDamPeriodCorePeriodImplPeriodIoPeriodSpecialFilesHandlerPeriodFilepatters,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodDayPeriodCqPeriodDamPeriodCorePeriodImplPeriodIoPeriodSpecialFilesHandlerPeriodFilepatters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesBuilder();
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

