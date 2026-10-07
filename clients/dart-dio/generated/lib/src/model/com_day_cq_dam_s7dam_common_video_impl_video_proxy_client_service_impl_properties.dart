//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_properties.g.dart';

/// ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
///
/// Properties:
/// * [cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodMinsizePeriodName] 
/// * [cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodPartsizePeriodName] 
/// * [cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodNumthreadPeriodName] 
/// * [cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodReadtimeoutPeriodName] 
/// * [cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodConnectiontimeoutPeriodName] 
/// * [cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodMaxretrycountPeriodName] 
/// * [cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodUploadprogressPeriodIntervalPeriodName] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties implements Built<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties, ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodMinsizePeriodName;

  @BuiltValueField(wireName: r'cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodPartsizePeriodName;

  @BuiltValueField(wireName: r'cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodNumthreadPeriodName;

  @BuiltValueField(wireName: r'cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodReadtimeoutPeriodName;

  @BuiltValueField(wireName: r'cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodConnectiontimeoutPeriodName;

  @BuiltValueField(wireName: r'cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodMaxretrycountPeriodName;

  @BuiltValueField(wireName: r'cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodUploadprogressPeriodIntervalPeriodName;

  ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties._();

  factory ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties([void updates(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties> get serializer => _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties, _$ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodMinsizePeriodName != null) {
      yield r'cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodMinsizePeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodPartsizePeriodName != null) {
      yield r'cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodPartsizePeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodNumthreadPeriodName != null) {
      yield r'cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodNumthreadPeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodReadtimeoutPeriodName != null) {
      yield r'cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodReadtimeoutPeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodConnectiontimeoutPeriodName != null) {
      yield r'cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodConnectiontimeoutPeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodMaxretrycountPeriodName != null) {
      yield r'cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodMaxretrycountPeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodUploadprogressPeriodIntervalPeriodName != null) {
      yield r'cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodUploadprogressPeriodIntervalPeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodMinsizePeriodName.replace(valueDes);
          break;
        case r'cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodPartsizePeriodName.replace(valueDes);
          break;
        case r'cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodMultipartuploadPeriodNumthreadPeriodName.replace(valueDes);
          break;
        case r'cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodReadtimeoutPeriodName.replace(valueDes);
          break;
        case r'cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodConnectiontimeoutPeriodName.replace(valueDes);
          break;
        case r'cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodHttpPeriodMaxretrycountPeriodName.replace(valueDes);
          break;
        case r'cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodS7damPeriodVideoproxyclientservicePeriodUploadprogressPeriodIntervalPeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesBuilder();
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

