//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_properties.g.dart';

/// ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
///
/// Properties:
/// * [eventPeriodFilter] 
/// * [fontmgrPeriodSystemPeriodFontPeriodDir] 
/// * [fontmgrPeriodAdobePeriodFontPeriodDir] 
/// * [fontmgrPeriodCustomerPeriodFontPeriodDir] 
@BuiltValue()
abstract class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties implements Built<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties, ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.filter')
  ConfigNodePropertyString? get eventPeriodFilter;

  @BuiltValueField(wireName: r'fontmgr.system.font.dir')
  ConfigNodePropertyArray? get fontmgrPeriodSystemPeriodFontPeriodDir;

  @BuiltValueField(wireName: r'fontmgr.adobe.font.dir')
  ConfigNodePropertyString? get fontmgrPeriodAdobePeriodFontPeriodDir;

  @BuiltValueField(wireName: r'fontmgr.customer.font.dir')
  ConfigNodePropertyString? get fontmgrPeriodCustomerPeriodFontPeriodDir;

  ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties._();

  factory ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties([void updates(ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder b)]) = _$ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties> get serializer => _$ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesSerializer();
}

class _$ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties, _$ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties];

  @override
  final String wireName = r'ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodFilter != null) {
      yield r'event.filter';
      yield serializers.serialize(
        object.eventPeriodFilter,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fontmgrPeriodSystemPeriodFontPeriodDir != null) {
      yield r'fontmgr.system.font.dir';
      yield serializers.serialize(
        object.fontmgrPeriodSystemPeriodFontPeriodDir,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.fontmgrPeriodAdobePeriodFontPeriodDir != null) {
      yield r'fontmgr.adobe.font.dir';
      yield serializers.serialize(
        object.fontmgrPeriodAdobePeriodFontPeriodDir,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fontmgrPeriodCustomerPeriodFontPeriodDir != null) {
      yield r'fontmgr.customer.font.dir';
      yield serializers.serialize(
        object.fontmgrPeriodCustomerPeriodFontPeriodDir,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodFilter.replace(valueDes);
          break;
        case r'fontmgr.system.font.dir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fontmgrPeriodSystemPeriodFontPeriodDir.replace(valueDes);
          break;
        case r'fontmgr.adobe.font.dir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.fontmgrPeriodAdobePeriodFontPeriodDir.replace(valueDes);
          break;
        case r'fontmgr.customer.font.dir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.fontmgrPeriodCustomerPeriodFontPeriodDir.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder();
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

