import { TestBed } from '@angular/core/testing';

import { SpringbootInterceptor } from './springboot-interceptor.service';

describe('SpringbootInterceptorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SpringbootInterceptor = TestBed.get(SpringbootInterceptor);
    expect(service).toBeTruthy();
  });
});
