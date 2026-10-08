//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_widget_impl_html_library_manager_impl_properties.g.dart';

/// ComDayCqWidgetImplHtmlLibraryManagerImplProperties
///
/// Properties:
/// * [htmllibmanagerPeriodClientmanager] 
/// * [htmllibmanagerPeriodDebug] 
/// * [htmllibmanagerPeriodDebugPeriodConsole] 
/// * [htmllibmanagerPeriodDebugPeriodInitPeriodJs] 
/// * [htmllibmanagerPeriodDefaultthemename] 
/// * [htmllibmanagerPeriodDefaultuserthemename] 
/// * [htmllibmanagerPeriodFirebuglitePeriodPath] 
/// * [htmllibmanagerPeriodForceCQUrlInfo] 
/// * [htmllibmanagerPeriodGzip] 
/// * [htmllibmanagerPeriodMaxage] 
/// * [htmllibmanagerPeriodMaxDataUriSize] 
/// * [htmllibmanagerPeriodMinify] 
/// * [htmllibmanagerPeriodPathPeriodList] 
/// * [htmllibmanagerPeriodTiming] 
@BuiltValue()
abstract class ComDayCqWidgetImplHtmlLibraryManagerImplProperties implements Built<ComDayCqWidgetImplHtmlLibraryManagerImplProperties, ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'htmllibmanager.clientmanager')
  ConfigNodePropertyString? get htmllibmanagerPeriodClientmanager;

  @BuiltValueField(wireName: r'htmllibmanager.debug')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodDebug;

  @BuiltValueField(wireName: r'htmllibmanager.debug.console')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodDebugPeriodConsole;

  @BuiltValueField(wireName: r'htmllibmanager.debug.init.js')
  ConfigNodePropertyString? get htmllibmanagerPeriodDebugPeriodInitPeriodJs;

  @BuiltValueField(wireName: r'htmllibmanager.defaultthemename')
  ConfigNodePropertyString? get htmllibmanagerPeriodDefaultthemename;

  @BuiltValueField(wireName: r'htmllibmanager.defaultuserthemename')
  ConfigNodePropertyString? get htmllibmanagerPeriodDefaultuserthemename;

  @BuiltValueField(wireName: r'htmllibmanager.firebuglite.path')
  ConfigNodePropertyString? get htmllibmanagerPeriodFirebuglitePeriodPath;

  @BuiltValueField(wireName: r'htmllibmanager.forceCQUrlInfo')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodForceCQUrlInfo;

  @BuiltValueField(wireName: r'htmllibmanager.gzip')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodGzip;

  @BuiltValueField(wireName: r'htmllibmanager.maxage')
  ConfigNodePropertyInteger? get htmllibmanagerPeriodMaxage;

  @BuiltValueField(wireName: r'htmllibmanager.maxDataUriSize')
  ConfigNodePropertyInteger? get htmllibmanagerPeriodMaxDataUriSize;

  @BuiltValueField(wireName: r'htmllibmanager.minify')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodMinify;

  @BuiltValueField(wireName: r'htmllibmanager.path.list')
  ConfigNodePropertyArray? get htmllibmanagerPeriodPathPeriodList;

  @BuiltValueField(wireName: r'htmllibmanager.timing')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodTiming;

  ComDayCqWidgetImplHtmlLibraryManagerImplProperties._();

  factory ComDayCqWidgetImplHtmlLibraryManagerImplProperties([void updates(ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder b)]) = _$ComDayCqWidgetImplHtmlLibraryManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWidgetImplHtmlLibraryManagerImplProperties> get serializer => _$ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesSerializer();
}

class _$ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWidgetImplHtmlLibraryManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWidgetImplHtmlLibraryManagerImplProperties, _$ComDayCqWidgetImplHtmlLibraryManagerImplProperties];

  @override
  final String wireName = r'ComDayCqWidgetImplHtmlLibraryManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWidgetImplHtmlLibraryManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.htmllibmanagerPeriodClientmanager != null) {
      yield r'htmllibmanager.clientmanager';
      yield serializers.serialize(
        object.htmllibmanagerPeriodClientmanager,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodDebug != null) {
      yield r'htmllibmanager.debug';
      yield serializers.serialize(
        object.htmllibmanagerPeriodDebug,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.htmllibmanagerPeriodDebugPeriodConsole != null) {
      yield r'htmllibmanager.debug.console';
      yield serializers.serialize(
        object.htmllibmanagerPeriodDebugPeriodConsole,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.htmllibmanagerPeriodDebugPeriodInitPeriodJs != null) {
      yield r'htmllibmanager.debug.init.js';
      yield serializers.serialize(
        object.htmllibmanagerPeriodDebugPeriodInitPeriodJs,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodDefaultthemename != null) {
      yield r'htmllibmanager.defaultthemename';
      yield serializers.serialize(
        object.htmllibmanagerPeriodDefaultthemename,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodDefaultuserthemename != null) {
      yield r'htmllibmanager.defaultuserthemename';
      yield serializers.serialize(
        object.htmllibmanagerPeriodDefaultuserthemename,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodFirebuglitePeriodPath != null) {
      yield r'htmllibmanager.firebuglite.path';
      yield serializers.serialize(
        object.htmllibmanagerPeriodFirebuglitePeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodForceCQUrlInfo != null) {
      yield r'htmllibmanager.forceCQUrlInfo';
      yield serializers.serialize(
        object.htmllibmanagerPeriodForceCQUrlInfo,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.htmllibmanagerPeriodGzip != null) {
      yield r'htmllibmanager.gzip';
      yield serializers.serialize(
        object.htmllibmanagerPeriodGzip,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.htmllibmanagerPeriodMaxage != null) {
      yield r'htmllibmanager.maxage';
      yield serializers.serialize(
        object.htmllibmanagerPeriodMaxage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.htmllibmanagerPeriodMaxDataUriSize != null) {
      yield r'htmllibmanager.maxDataUriSize';
      yield serializers.serialize(
        object.htmllibmanagerPeriodMaxDataUriSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.htmllibmanagerPeriodMinify != null) {
      yield r'htmllibmanager.minify';
      yield serializers.serialize(
        object.htmllibmanagerPeriodMinify,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.htmllibmanagerPeriodPathPeriodList != null) {
      yield r'htmllibmanager.path.list';
      yield serializers.serialize(
        object.htmllibmanagerPeriodPathPeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.htmllibmanagerPeriodTiming != null) {
      yield r'htmllibmanager.timing';
      yield serializers.serialize(
        object.htmllibmanagerPeriodTiming,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWidgetImplHtmlLibraryManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'htmllibmanager.clientmanager':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodClientmanager.replace(valueDes);
          break;
        case r'htmllibmanager.debug':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDebug.replace(valueDes);
          break;
        case r'htmllibmanager.debug.console':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDebugPeriodConsole.replace(valueDes);
          break;
        case r'htmllibmanager.debug.init.js':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDebugPeriodInitPeriodJs.replace(valueDes);
          break;
        case r'htmllibmanager.defaultthemename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDefaultthemename.replace(valueDes);
          break;
        case r'htmllibmanager.defaultuserthemename':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDefaultuserthemename.replace(valueDes);
          break;
        case r'htmllibmanager.firebuglite.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodFirebuglitePeriodPath.replace(valueDes);
          break;
        case r'htmllibmanager.forceCQUrlInfo':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodForceCQUrlInfo.replace(valueDes);
          break;
        case r'htmllibmanager.gzip':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodGzip.replace(valueDes);
          break;
        case r'htmllibmanager.maxage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodMaxage.replace(valueDes);
          break;
        case r'htmllibmanager.maxDataUriSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodMaxDataUriSize.replace(valueDes);
          break;
        case r'htmllibmanager.minify':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodMinify.replace(valueDes);
          break;
        case r'htmllibmanager.path.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodPathPeriodList.replace(valueDes);
          break;
        case r'htmllibmanager.timing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodTiming.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWidgetImplHtmlLibraryManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWidgetImplHtmlLibraryManagerImplPropertiesBuilder();
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

