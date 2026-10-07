//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties.g.dart';

/// ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
///
/// Properties:
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath] 
/// * [comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency] 
@BuiltValue()
abstract class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties implements Built<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath')
  ConfigNodePropertyArray? get comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath;

  @BuiltValueField(wireName: r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency')
  ConfigNodePropertyString? get comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency;

  ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties._();

  factory ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties([void updates(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder b)]) = _$ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties> get serializer => _$ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesSerializer();
}

class _$ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties, _$ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath != null) {
      yield r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency != null) {
      yield r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodProjectPath.replace(valueDes);
          break;
        case r'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodScreensPeriodOfflinecontentPeriodImplPeriodBulkOfflineUpdateServiceImplPeriodScheduleFrequency.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesBuilder();
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

