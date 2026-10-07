//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_servlet_companion_servlet_properties.g.dart';

/// ComDayCqDamCoreImplServletCompanionServletProperties
///
/// Properties:
/// * [moreInfo] 
/// * [slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoPeriodHtmlSlashDollarLeftCurlyBracketPathRightCurlyBracket] 
@BuiltValue()
abstract class ComDayCqDamCoreImplServletCompanionServletProperties implements Built<ComDayCqDamCoreImplServletCompanionServletProperties, ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'More Info')
  ConfigNodePropertyString? get moreInfo;

  @BuiltValueField(wireName: r'/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}')
  ConfigNodePropertyString? get slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoPeriodHtmlSlashDollarLeftCurlyBracketPathRightCurlyBracket;

  ComDayCqDamCoreImplServletCompanionServletProperties._();

  factory ComDayCqDamCoreImplServletCompanionServletProperties([void updates(ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder b)]) = _$ComDayCqDamCoreImplServletCompanionServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplServletCompanionServletProperties> get serializer => _$ComDayCqDamCoreImplServletCompanionServletPropertiesSerializer();
}

class _$ComDayCqDamCoreImplServletCompanionServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplServletCompanionServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplServletCompanionServletProperties, _$ComDayCqDamCoreImplServletCompanionServletProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplServletCompanionServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplServletCompanionServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.moreInfo != null) {
      yield r'More Info';
      yield serializers.serialize(
        object.moreInfo,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoPeriodHtmlSlashDollarLeftCurlyBracketPathRightCurlyBracket != null) {
      yield r'/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}';
      yield serializers.serialize(
        object.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoPeriodHtmlSlashDollarLeftCurlyBracketPathRightCurlyBracket,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplServletCompanionServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'More Info':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.moreInfo.replace(valueDes);
          break;
        case r'/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoPeriodHtmlSlashDollarLeftCurlyBracketPathRightCurlyBracket.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplServletCompanionServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplServletCompanionServletPropertiesBuilder();
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

