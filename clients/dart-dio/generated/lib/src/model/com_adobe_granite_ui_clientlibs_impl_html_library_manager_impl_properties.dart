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

part 'com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties.g.dart';

/// ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
///
/// Properties:
/// * [htmllibmanagerPeriodTiming] 
/// * [htmllibmanagerPeriodDebugPeriodInitPeriodJs] 
/// * [htmllibmanagerPeriodMinify] 
/// * [htmllibmanagerPeriodDebug] 
/// * [htmllibmanagerPeriodGzip] 
/// * [htmllibmanagerPeriodMaxDataUriSize] 
/// * [htmllibmanagerPeriodMaxage] 
/// * [htmllibmanagerPeriodForceCQUrlInfo] 
/// * [htmllibmanagerPeriodDefaultthemename] 
/// * [htmllibmanagerPeriodDefaultuserthemename] 
/// * [htmllibmanagerPeriodClientmanager] 
/// * [htmllibmanagerPeriodPathPeriodList] 
/// * [htmllibmanagerPeriodExcludedPeriodPathPeriodList] 
/// * [htmllibmanagerPeriodProcessorPeriodJs] 
/// * [htmllibmanagerPeriodProcessorPeriodCss] 
/// * [htmllibmanagerPeriodLongcachePeriodPatterns] 
/// * [htmllibmanagerPeriodLongcachePeriodFormat] 
/// * [htmllibmanagerPeriodUseFileSystemOutputCache] 
/// * [htmllibmanagerPeriodFileSystemOutputCacheLocation] 
/// * [htmllibmanagerPeriodDisablePeriodReplacement] 
@BuiltValue()
abstract class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties implements Built<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties, ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'htmllibmanager.timing')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodTiming;

  @BuiltValueField(wireName: r'htmllibmanager.debug.init.js')
  ConfigNodePropertyString? get htmllibmanagerPeriodDebugPeriodInitPeriodJs;

  @BuiltValueField(wireName: r'htmllibmanager.minify')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodMinify;

  @BuiltValueField(wireName: r'htmllibmanager.debug')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodDebug;

  @BuiltValueField(wireName: r'htmllibmanager.gzip')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodGzip;

  @BuiltValueField(wireName: r'htmllibmanager.maxDataUriSize')
  ConfigNodePropertyInteger? get htmllibmanagerPeriodMaxDataUriSize;

  @BuiltValueField(wireName: r'htmllibmanager.maxage')
  ConfigNodePropertyInteger? get htmllibmanagerPeriodMaxage;

  @BuiltValueField(wireName: r'htmllibmanager.forceCQUrlInfo')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodForceCQUrlInfo;

  @BuiltValueField(wireName: r'htmllibmanager.defaultthemename')
  ConfigNodePropertyString? get htmllibmanagerPeriodDefaultthemename;

  @BuiltValueField(wireName: r'htmllibmanager.defaultuserthemename')
  ConfigNodePropertyString? get htmllibmanagerPeriodDefaultuserthemename;

  @BuiltValueField(wireName: r'htmllibmanager.clientmanager')
  ConfigNodePropertyString? get htmllibmanagerPeriodClientmanager;

  @BuiltValueField(wireName: r'htmllibmanager.path.list')
  ConfigNodePropertyArray? get htmllibmanagerPeriodPathPeriodList;

  @BuiltValueField(wireName: r'htmllibmanager.excluded.path.list')
  ConfigNodePropertyArray? get htmllibmanagerPeriodExcludedPeriodPathPeriodList;

  @BuiltValueField(wireName: r'htmllibmanager.processor.js')
  ConfigNodePropertyArray? get htmllibmanagerPeriodProcessorPeriodJs;

  @BuiltValueField(wireName: r'htmllibmanager.processor.css')
  ConfigNodePropertyArray? get htmllibmanagerPeriodProcessorPeriodCss;

  @BuiltValueField(wireName: r'htmllibmanager.longcache.patterns')
  ConfigNodePropertyArray? get htmllibmanagerPeriodLongcachePeriodPatterns;

  @BuiltValueField(wireName: r'htmllibmanager.longcache.format')
  ConfigNodePropertyString? get htmllibmanagerPeriodLongcachePeriodFormat;

  @BuiltValueField(wireName: r'htmllibmanager.useFileSystemOutputCache')
  ConfigNodePropertyBoolean? get htmllibmanagerPeriodUseFileSystemOutputCache;

  @BuiltValueField(wireName: r'htmllibmanager.fileSystemOutputCacheLocation')
  ConfigNodePropertyString? get htmllibmanagerPeriodFileSystemOutputCacheLocation;

  @BuiltValueField(wireName: r'htmllibmanager.disable.replacement')
  ConfigNodePropertyArray? get htmllibmanagerPeriodDisablePeriodReplacement;

  ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties._();

  factory ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties([void updates(ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder b)]) = _$ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties> get serializer => _$ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesSerializer();
}

class _$ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties, _$ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.htmllibmanagerPeriodTiming != null) {
      yield r'htmllibmanager.timing';
      yield serializers.serialize(
        object.htmllibmanagerPeriodTiming,
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
    if (object.htmllibmanagerPeriodMinify != null) {
      yield r'htmllibmanager.minify';
      yield serializers.serialize(
        object.htmllibmanagerPeriodMinify,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.htmllibmanagerPeriodDebug != null) {
      yield r'htmllibmanager.debug';
      yield serializers.serialize(
        object.htmllibmanagerPeriodDebug,
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
    if (object.htmllibmanagerPeriodMaxDataUriSize != null) {
      yield r'htmllibmanager.maxDataUriSize';
      yield serializers.serialize(
        object.htmllibmanagerPeriodMaxDataUriSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.htmllibmanagerPeriodMaxage != null) {
      yield r'htmllibmanager.maxage';
      yield serializers.serialize(
        object.htmllibmanagerPeriodMaxage,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.htmllibmanagerPeriodForceCQUrlInfo != null) {
      yield r'htmllibmanager.forceCQUrlInfo';
      yield serializers.serialize(
        object.htmllibmanagerPeriodForceCQUrlInfo,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
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
    if (object.htmllibmanagerPeriodClientmanager != null) {
      yield r'htmllibmanager.clientmanager';
      yield serializers.serialize(
        object.htmllibmanagerPeriodClientmanager,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodPathPeriodList != null) {
      yield r'htmllibmanager.path.list';
      yield serializers.serialize(
        object.htmllibmanagerPeriodPathPeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.htmllibmanagerPeriodExcludedPeriodPathPeriodList != null) {
      yield r'htmllibmanager.excluded.path.list';
      yield serializers.serialize(
        object.htmllibmanagerPeriodExcludedPeriodPathPeriodList,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.htmllibmanagerPeriodProcessorPeriodJs != null) {
      yield r'htmllibmanager.processor.js';
      yield serializers.serialize(
        object.htmllibmanagerPeriodProcessorPeriodJs,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.htmllibmanagerPeriodProcessorPeriodCss != null) {
      yield r'htmllibmanager.processor.css';
      yield serializers.serialize(
        object.htmllibmanagerPeriodProcessorPeriodCss,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.htmllibmanagerPeriodLongcachePeriodPatterns != null) {
      yield r'htmllibmanager.longcache.patterns';
      yield serializers.serialize(
        object.htmllibmanagerPeriodLongcachePeriodPatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.htmllibmanagerPeriodLongcachePeriodFormat != null) {
      yield r'htmllibmanager.longcache.format';
      yield serializers.serialize(
        object.htmllibmanagerPeriodLongcachePeriodFormat,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodUseFileSystemOutputCache != null) {
      yield r'htmllibmanager.useFileSystemOutputCache';
      yield serializers.serialize(
        object.htmllibmanagerPeriodUseFileSystemOutputCache,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.htmllibmanagerPeriodFileSystemOutputCacheLocation != null) {
      yield r'htmllibmanager.fileSystemOutputCacheLocation';
      yield serializers.serialize(
        object.htmllibmanagerPeriodFileSystemOutputCacheLocation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.htmllibmanagerPeriodDisablePeriodReplacement != null) {
      yield r'htmllibmanager.disable.replacement';
      yield serializers.serialize(
        object.htmllibmanagerPeriodDisablePeriodReplacement,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'htmllibmanager.timing':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodTiming.replace(valueDes);
          break;
        case r'htmllibmanager.debug.init.js':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDebugPeriodInitPeriodJs.replace(valueDes);
          break;
        case r'htmllibmanager.minify':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodMinify.replace(valueDes);
          break;
        case r'htmllibmanager.debug':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDebug.replace(valueDes);
          break;
        case r'htmllibmanager.gzip':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodGzip.replace(valueDes);
          break;
        case r'htmllibmanager.maxDataUriSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodMaxDataUriSize.replace(valueDes);
          break;
        case r'htmllibmanager.maxage':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodMaxage.replace(valueDes);
          break;
        case r'htmllibmanager.forceCQUrlInfo':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodForceCQUrlInfo.replace(valueDes);
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
        case r'htmllibmanager.clientmanager':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodClientmanager.replace(valueDes);
          break;
        case r'htmllibmanager.path.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodPathPeriodList.replace(valueDes);
          break;
        case r'htmllibmanager.excluded.path.list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodExcludedPeriodPathPeriodList.replace(valueDes);
          break;
        case r'htmllibmanager.processor.js':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodProcessorPeriodJs.replace(valueDes);
          break;
        case r'htmllibmanager.processor.css':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodProcessorPeriodCss.replace(valueDes);
          break;
        case r'htmllibmanager.longcache.patterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodLongcachePeriodPatterns.replace(valueDes);
          break;
        case r'htmllibmanager.longcache.format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodLongcachePeriodFormat.replace(valueDes);
          break;
        case r'htmllibmanager.useFileSystemOutputCache':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodUseFileSystemOutputCache.replace(valueDes);
          break;
        case r'htmllibmanager.fileSystemOutputCacheLocation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodFileSystemOutputCacheLocation.replace(valueDes);
          break;
        case r'htmllibmanager.disable.replacement':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.htmllibmanagerPeriodDisablePeriodReplacement.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesBuilder();
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

